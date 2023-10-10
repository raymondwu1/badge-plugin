package com.jenkinsci.plugins.badge.action;


import hudson.model.Hudson;
import org.junit.Rule;
import org.junit.Test;
import org.jvnet.hudson.test.JenkinsRule;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class BadgeActionTest {

  @Rule
  public JenkinsRule r = new JenkinsRule();

  @Test
  public void getIconPath() {
    assertNull(BadgeAction.getIconPath(null));
    assertEquals("/icon.svg", BadgeAction.getIconPath("/icon.svg"));
    assertEquals("http://foo.com/icon.svg", BadgeAction.getIconPath("http://foo.com/icon.svg"));
    assertEquals("https://foo.com/icon.svg", BadgeAction.getIconPath("https://foo.com/icon.svg"));

    assertEquals(Hudson.RESOURCE_PATH + "/images/svgs/http.svg", BadgeAction.getIconPath("http.svg"));

  }

}
