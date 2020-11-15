package py.com.sodep.mf.form.model.prototype;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class MFPhoto extends MFPrototype {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private boolean cameraOnly;

	public boolean isCameraOnly() {
		return cameraOnly;
	}

	public void setCameraOnly(boolean cameraOnly) {
		this.cameraOnly = cameraOnly;
	}

	@Override
	public Type getType() {
		return Type.PHOTO;
	}

}
