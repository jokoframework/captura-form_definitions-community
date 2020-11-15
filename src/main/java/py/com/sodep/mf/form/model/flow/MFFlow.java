package py.com.sodep.mf.form.model.flow;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class MFFlow implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6512463046336518350L;

	private String defaultTarget;

	private List<MFConditionalTarget> targets;

	public String getDefaultTarget() {
		return defaultTarget;
	}

	public void setDefaultTarget(String defaultTarget) {
		this.defaultTarget = defaultTarget;
	}

	public List<MFConditionalTarget> getTargets() {
		return targets;
	}

	public void setTargets(List<MFConditionalTarget> targets) {
		this.targets = targets;
	}

}
