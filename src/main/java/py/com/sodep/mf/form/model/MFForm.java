package py.com.sodep.mf.form.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import py.com.sodep.mf.form.model.element.MFElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

// This class is intended to replace the XML sent with py.com.sodep.mf.exchange.objects.metadata.Form
//
/**
 * MFForm should allow to show the form with its pages, the pages' elements and
 * their types. It should contain all the necessary data.
 * 
 * @author Miguel
 * 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property = "@class")
public class MFForm extends MFBaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long version;

	private String label;

	private String description;

	private boolean provideLocation;

	private List<MFPage> pages;

	// I don't believe this field should be part of the form definition
	private boolean published;

	// I don't believe this field should be part of the form definition
	private Long versionPublished;

	private boolean wasPublished;

	public List<MFPage> getPages() {
		return pages;
	}

	public void setPages(List<MFPage> pages) {
		this.pages = pages;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	// Not so sure if version should be here... let's see
	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public boolean isPublished() {
		return published;
	}

	public void setPublished(boolean published) {
		this.published = published;
	}

	public Long getVersionPublished() {
		return versionPublished;
	}

	public void setVersionPublished(Long versionPublished) {
		this.versionPublished = versionPublished;
	}

	public boolean isProvideLocation() {
		return provideLocation;
	}

	public void setProvideLocation(boolean provideLocation) {
		this.provideLocation = provideLocation;
	}

	private List<MFElement> allElements = null;

	public List<MFElement> listAllElements() {
		if (allElements == null) {
			allElements = new ArrayList<MFElement>();
			if (pages != null) {
				for (MFPage page : pages) {
					List<MFElement> elements = page.getElements();
					if (elements != null) {
						for (MFElement e : elements) {
							allElements.add(e);
						}
					}
				}
			}
		}
		return allElements;
	}

	private Map<String, MFElement> elementsMap = null;

	public Map<String, MFElement> elementsMappedByName() {
		if (elementsMap == null) {
			elementsMap = new HashMap<String, MFElement>();
			List<MFElement> elements = listAllElements();
			for (MFElement e : elements) {
				elementsMap.put(e.getInstanceId(), e);
			}
		}
		return elementsMap;
	}

	public MFPage getPageById(Long pageId) {
		if (pages != null) {
			for (MFPage p : pages) {
				if (p.getId().equals(pageId)) {
					return p;
				}
			}
		}
		return null;
	}

	public boolean isWasPublished() {
		return wasPublished;
	}

	public void setWasPublished(boolean wasPublished) {
		this.wasPublished = wasPublished;
	}

	@Override
	public Type getType() {
		return MFBaseModel.Type.FORM;
	}

}
