package org.springframework.samples.petclinic.acceptance.pom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.acceptance.selenium.Browser;
import org.springframework.stereotype.Service;

@Service
public class OwnerList {

	private static String findByNameField = "id:lastName";

	private static String findOwnerBtn = "xpath://button[contains(normalize-space(text()), 'Find Owner')]";

	private static String addOwnerBtn = "xpath://a[contains(normalize-space(text()), 'Add Owner')]";

	private final Browser browser;

	@Autowired
	public OwnerList(Browser wb) {
		this.browser = wb;
	}

	public void setLastNameToFind(String value) {
		this.browser.write(findByNameField, value);
	}

	public void findOwner() {
		this.browser.click(findOwnerBtn);
	}

	public void addOwner() {
		this.browser.click(addOwnerBtn);
	}

}
