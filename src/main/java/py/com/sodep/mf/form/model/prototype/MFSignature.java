package py.com.sodep.mf.form.model.prototype;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class MFSignature extends MFPrototype {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public Type getType() {
		return Type.SIGNATURE;
	}

}
