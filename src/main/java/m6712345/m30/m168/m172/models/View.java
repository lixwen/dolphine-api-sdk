/*
 * DolphinSchedulerApiDocsLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package m6712345.m30.m168.m172.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for View type.
 */
public class View {
    private String contentType;

    /**
     * Default constructor.
     */
    public View() {
    }

    /**
     * Initialization constructor.
     * @param  contentType  String value for contentType.
     */
    public View(
            String contentType) {
        this.contentType = contentType;
    }

    /**
     * Getter for ContentType.
     * @return Returns the String
     */
    @JsonGetter("contentType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getContentType() {
        return contentType;
    }

    /**
     * Setter for ContentType.
     * @param contentType Value for String
     */
    @JsonSetter("contentType")
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * Converts this View into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "View [" + "contentType=" + contentType + "]";
    }

    /**
     * Builds a new {@link View.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link View.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .contentType(getContentType());
        return builder;
    }

    /**
     * Class to build instances of {@link View}.
     */
    public static class Builder {
        private String contentType;



        /**
         * Setter for contentType.
         * @param  contentType  String value for contentType.
         * @return Builder
         */
        public Builder contentType(String contentType) {
            this.contentType = contentType;
            return this;
        }

        /**
         * Builds a new {@link View} object using the set fields.
         * @return {@link View}
         */
        public View build() {
            return new View(contentType);
        }
    }
}
