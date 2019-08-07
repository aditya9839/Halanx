
package com.example.halanx.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RequestObject {

    @SerializedName("data")
    @Expose
    private String data;
    @SerializedName("dataMode")
    @Expose
    private String dataMode;
    @SerializedName("headerData")
    @Expose
    private List<HeaderDatum_> headerData = null;
    @SerializedName("method")
    @Expose
    private String method;
    @SerializedName("pathVariableData")
    @Expose
    private List<Object> pathVariableData = null;
    @SerializedName("queryParams")
    @Expose
    private List<QueryParam_> queryParams = null;
    @SerializedName("url")
    @Expose
    private String url;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDataMode() {
        return dataMode;
    }

    public void setDataMode(String dataMode) {
        this.dataMode = dataMode;
    }

    public List<HeaderDatum_> getHeaderData() {
        return headerData;
    }

    public void setHeaderData(List<HeaderDatum_> headerData) {
        this.headerData = headerData;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public List<Object> getPathVariableData() {
        return pathVariableData;
    }

    public void setPathVariableData(List<Object> pathVariableData) {
        this.pathVariableData = pathVariableData;
    }

    public List<QueryParam_> getQueryParams() {
        return queryParams;
    }

    public void setQueryParams(List<QueryParam_> queryParams) {
        this.queryParams = queryParams;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
