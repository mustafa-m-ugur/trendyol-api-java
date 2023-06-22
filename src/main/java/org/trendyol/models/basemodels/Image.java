package org.trendyol.models.basemodels;

import org.trendyol.ToStringRequestBuilder;

public class Image {
    public String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return new ToStringRequestBuilder(this)
                .append("url", url)
                .toString();
    }
}
