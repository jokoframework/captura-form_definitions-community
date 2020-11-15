package py.com.sodep.mf.form.model;

import java.io.Serializable;
import java.util.Map;

public abstract class MFBaseModel implements Serializable {

	public static enum Type {
		FORM, PAGE, ELEMENT, INPUT, LOCATION, PHOTO, SELECT, HEADLINE, CHECKBOX, BARCODE, SIGNATURE
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;

	private Map<String, PropertyMetadata> propertyMetadata;

	public Long getId() {
		return id;
	}

	/**
	 * A property might have Attributes that indicate, for example, if it should
	 * be editable, if it should be visible, etc. (Mostly used in the Form
	 * Editor)
	 * 
	 * @return
	 */
	public Map<String, PropertyMetadata> getPropertyMetadata() {
		return propertyMetadata;
	}

	public void setPropertyMetadata(Map<String, PropertyMetadata> propertyMetadata) {
		this.propertyMetadata = propertyMetadata;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public abstract Type getType();

}
