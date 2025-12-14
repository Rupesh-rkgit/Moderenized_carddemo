package com.carddemo.core.domain;

import lombok.Data;
import java.io.Serializable;

@Data
public class CardCrossReferenceId implements Serializable {
    private String xrefCardNumber;
}
