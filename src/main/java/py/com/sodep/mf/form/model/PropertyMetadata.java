package py.com.sodep.mf.form.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Has information of the property and how to show it on the editor
 * 
 * @author Miguel
 * 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class PropertyMetadata implements Serializable {

	public enum Type {
		STRING, STRING_LONG, BOOLEAN, INTEGER, DOUBLE, ENUM, OBJECT, DATE, TIME
	}

	public static class PropertyOption {
		private Object value;

		private String label;

		public PropertyOption() {

		}

		public PropertyOption(String label, Object value) {
			this.label = label;
			this.value = value;
		}

		public Object getValue() {
			return value;
		}

		public void setValue(Object value) {
			this.value = value;
		}

		public String getLabel() {
			return label;
		}

		public void setLabel(String label) {
			this.label = label;
		}

	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private boolean editable;

	private boolean visible;

	private String label;

	private int importance;

	private Type type = Type.STRING;

	private List<PropertyOption> options;

	public PropertyMetadata(String label, boolean visible, boolean editable) {
		this.label = label;
		this.visible = visible;
		this.editable = editable;
	}

	public PropertyMetadata(String label, boolean visible, boolean editable, Type type) {
		this.label = label;
		this.visible = visible;
		this.editable = editable;
		this.type = type;
	}

	public PropertyMetadata(String label, boolean visible, boolean editable, Type type, int importance) {
		this.label = label;
		this.visible = visible;
		this.editable = editable;
		this.type = type;
		this.importance = importance;
	}

	public boolean isEditable() {
		return editable;
	}

	public void setEditable(boolean editable) {
		this.editable = editable;
	}

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public int getImportance() {
		return importance;
	}

	public void setImportance(int importance) {
		this.importance = importance;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public List<PropertyOption> getOptions() {
		return options;
	}

	public void setOptions(List<PropertyOption> options) {
		this.options = options;
	}

}
