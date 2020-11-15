package py.com.sodep.mf.form.model.prototype;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class MFSelect extends MFPrototype {

	public static enum OptionSource {
		EMBEDDED("embedded"), LOOKUP_TABLE("lookup_table");

		private String name;

		OptionSource(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}

	};

	private final static Collection<OptionSource> sources = Collections.unmodifiableCollection(Arrays
			.asList(OptionSource.values()));

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String defaultValue;

	private Long lookupTableId;

	private OptionSource source;

	private String lookupLabel;

	private String lookupValue;

	private String embeddedValues;

	public String getDefaultValue() {
		return defaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

	public Long getLookupTableId() {
		return lookupTableId;
	}

	public void setLookupTableId(Long lookupTableId) {
		this.lookupTableId = lookupTableId;
	}

	public OptionSource getSource() {
		return source;
	}

	public void setSource(OptionSource source) {
		this.source = source;
	}

	public static Collection<OptionSource> getSources() {
		return sources;
	}

	public String getLookupLabel() {
		return lookupLabel;
	}

	public void setLookupLabel(String lookupLabel) {
		this.lookupLabel = lookupLabel;
	}

	public String getLookupValue() {
		return lookupValue;
	}

	public void setLookupValue(String lookupValue) {
		this.lookupValue = lookupValue;
	}

	public String getEmbeddedValues() {
		return embeddedValues;
	}

	public void setEmbeddedValues(String embeddedValues) {
		this.embeddedValues = embeddedValues;
	}

	@Override
	public Type getType() {
		return Type.SELECT;
	}

}
