package py.com.sodep.mf.form.model.prototype;

import java.util.ArrayList;
import java.util.List;

import py.com.sodep.mf.form.model.MFBaseModel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class MFInput extends MFPrototype {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public enum Type {
		TEXT("text"), DATE("date"), TIME("time"), DATETIME("datetime"), PASSWORD("password"), INTEGER("integer"), DECIMAL(
				"decimal"), TEXTAREA("textarea");

		public static Type[] textualTypes = new Type[] { TEXT, TEXTAREA, PASSWORD };
		public static Type[] numericTypes = new Type[] { INTEGER, DECIMAL };
		public static Type[] temporalTypes = new Type[] { DATE, TIME, DATETIME };

		public static Type safeValueOf(String type) {
			if (type == null) {
				return null;
			}
			Type[] values = values();
			for (Type inputType : values) {
				if (inputType.name.equals(type)) {
					return inputType;
				}
			}
			return null;
		}

		private String name;

		public String getName() {
			return name;
		}

		private Type(String name) {
			this.name = name;
		}

		public static boolean isTextualType(String type) {
			return isTypeFrom(type, textualTypes);
		}

		public static boolean isNumericType(String type) {
			return isTypeFrom(type, numericTypes);
		}

		public static boolean isTemporalType(String type) {
			return isTypeFrom(type, temporalTypes);
		}

		public static boolean isValidType(String type) {
			return isTypeFrom(type, values());
		}

		private static boolean isTypeFrom(String type, Type[] typeList) {
			if (type == null) {
				return false;
			}
			for (Type value : typeList) {
				if (value.toString().equals(type)) {
					return true;
				}
			}
			return false;
		}

		@Override
		public String toString() {
			return name;
		}

		public static String[] allTypes() {
			List<String> result = new ArrayList<String>();
			for (Type value : values()) {
				result.add(value.name);
			}
			return result.toArray(new String[0]);
		}
	}

	private Type subtype;

	// FIXME should this be Object to accomodate Date, Time and other input
	// types? or just pass the string serialized version and the receiver is
	// responsible of translating and presenting it?
	private String defaultValue;

	private boolean readOnly;

	private Integer maxLength;

	private Integer minLength;

	public Type getSubtype() {
		return subtype;
	}

	public void setSubtype(Type inputType) {
		this.subtype = inputType;
	}

	public String getDefaultValue() {
		return defaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

	public boolean isReadOnly() {
		return readOnly;
	}

	public void setReadOnly(boolean readOnly) {
		this.readOnly = readOnly;
	}

	public Integer getMaxLength() {
		return maxLength;
	}

	public void setMaxLength(Integer maxLength) {
		this.maxLength = maxLength;
	}

	public Integer getMinLength() {
		return minLength;
	}

	public void setMinLength(Integer minLength) {
		this.minLength = minLength;
	}

	@Override
	public MFBaseModel.Type getType() {
		return MFBaseModel.Type.INPUT;
	}

}
