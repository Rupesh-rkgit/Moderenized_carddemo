export class TableDataChunk {
  public next: TableDataChunk;
  public prev: TableDataChunk;

  constructor(
    public start: number, // Inclusive
    public end: number, // Exclusive
  ) {
    this.next = undefined;
    this.prev = undefined;
  }

  containsRow(row: number): boolean {
    return row >= this.start && row < this.end;
  }

  contains(pageStart: number, pageEnd: number) {
    return pageStart >= this.start && pageEnd <= this.end;
  }

  getText(): string {
    return '(' + this.start + ', ' + this.end + ')';
  }

  validate(): boolean {
    if (this.prev !== undefined && this.prev.end >= this.start) {
      console.log('Something is wrong with node %s --> *%s', this.prev.getText(), this.getText());
      return false;
    }
    if (this.next !== undefined && this.end >= this.next.start) {
      console.log('Something is wrong with node *%s --> %s', this.getText(), this.next.getText());
      return false;
    }
    if (this.start > this.end) {
      console.log('Something is wrong with node %s', this.getText());
      return false;
    }
    return true;
  }
}

export class TableMetadata {
  componentId: string
  headChunk: TableDataChunk;
  tailChunk: TableDataChunk;
  currentChunk: TableDataChunk;
  tableLength: number;

  getText(): string {
    let text: string = '';
    let left = this.headChunk;
    while (left !== undefined) {
      text = text + left.getText() + ' --> ';
      left = left.next;
    }
    return 'head --> ' + this.headChunk.getText() + ' | --> ' + text + ' | ' + this.tailChunk.getText() + ' <-- tail';
  }

  getTextReverse(): string {
    let text: string = '';
    let right = this.tailChunk;
    while (right !== undefined) {
      text = ' <-- ' + right.getText() + text;
      right = right.prev;
    }
    return 'head --> ' + this.headChunk.getText() + ' |' + text + ' <-- ' + ' | ' + this.tailChunk.getText() + ' <-- tail';
  }

  validate(): boolean {
    // Validate tail chunk
    let node: TableDataChunk = this.headChunk;
    let lastNode: TableDataChunk = undefined;
    while(node !== undefined) {
      if (!node.validate()) {
        return false;
      }
      lastNode = node;
      node = node.next;
    }
    if (lastNode !== this.tailChunk) {
      console.log('Tail chunk and the linked list not in sync');
      return false;
    }
    node = this.tailChunk;
    lastNode = undefined;
    while(node !== undefined) {
      if (!node.validate()) {
        console.log('Something is wrong with node ', node.getText());
        return false;
      }
      lastNode = node;
      node = node.prev;
    }
    if (lastNode !== this.headChunk) {
      console.log('Head chunk and the linked list not in sync');
      return false;
    }
    return true;
  }
}
