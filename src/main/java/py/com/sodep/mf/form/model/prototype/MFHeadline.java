package py.com.sodep.mf.form.model.prototype;

import py.com.sodep.mf.form.model.MFBaseModel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class MFHeadline extends MFPrototype {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	@Override
	public boolean isOutputOnly() {
		return true;
	}

	@Override
	public MFBaseModel.Type getType() {
		return Type.HEADLINE;
	}

}
