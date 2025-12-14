package aws.bluage.l3.workshop.spring;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationBeanNameGenerator;

/**
 * Used for the naming of the scanned services.
 * This class only overrides the fallback case of the standard generator.
 * By using this class, exactly the same behavior as in standard is obtained
 * except if no name is supplied in the annotation, in which case:
 * - in standard, the short name is used, which raises issues with homonyms
 * - here, the fully qualified name is used
 */
public class QualifiedBeanNameGenerator extends AnnotationBeanNameGenerator {
	/**
	 * Builds the bean name simply as the class fully qualified name.
	 * @param definition : the bean definition
	 * @return the fully qualified name
	 */
	protected String buildDefaultBeanName(BeanDefinition definition) {
		return definition.getBeanClassName();
	}
}
