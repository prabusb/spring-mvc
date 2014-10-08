
package com.learn.mvc.modal;




/**
 * Represents the link to the subsequent resource.
 * 
 * @author Prabu S B
 * @version 1.0
 * @since 27 May 2014
 */
public class Link {

    private String rel;

    private String href;
    
    /**
     * Instantiates a new link.<br>
     * Should not be referenced in JAVA code, Only for spring binding
     */
    public Link() {
        // intentionally empty
    }

    /**
     * Constructor used as setter
     * 
     * @param rel the rel
     * @param href the link
     */
    public Link(String rel, String href) {
        this.rel = rel;
        this.href = href;
    }

    /**
     * Gets the Rel
     * 
     * @return the rel
     */
    public String getRel() {
        return rel;
    }

    /**
     * Gets the Href.
     * 
     * @return the href
     */
    public String getHref() {
        return href;
    }

  

}
