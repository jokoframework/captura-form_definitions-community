package py.com.sodep.mf.form.model.prototype;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class MFLocation extends MFPrototype {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Double defaultLatitude;

	private Double defaultLongitude;

	public Double getDefaultLatitude() {
		return defaultLatitude;
	}

	public void setDefaultLatitude(Double defaultLatitude) {
		this.defaultLatitude = defaultLatitude;
	}

	public Double getDefaultLongitude() {
		return defaultLongitude;
	}

	public void setDefaultLongitude(Double defaultLongitude) {
		this.defaultLongitude = defaultLongitude;
	}

	@Override
	public Type getType() {
		return Type.LOCATION;
	}

}
