
package com.example.halanx.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Request {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("description")
    @Expose
    private Object description;
    @SerializedName("data")
    @Expose
    private List<Object> data = null;
    @SerializedName("dataMode")
    @Expose
    private String dataMode;
    @SerializedName("headerData")
    @Expose
    private List<HeaderDatum> headerData = null;
    @SerializedName("method")
    @Expose
    private String method;
    @SerializedName("pathVariableData")
    @Expose
    private List<Object> pathVariableData = null;
    @SerializedName("queryParams")
    @Expose
    private List<QueryParam> queryParams = null;
    @SerializedName("auth")
    @Expose
    private Auth auth;
    @SerializedName("events")
    @Expose
    private Object events;
    @SerializedName("folder")
    @Expose
    private Object folder;
    @SerializedName("responses")
    @Expose
    private List<Response> responses = null;
    @SerializedName("currentHelper")
    @Expose
    private Object currentHelper;
    @SerializedName("helperAttributes")
    @Expose
    private Object helperAttributes;
    @SerializedName("collectionId")
    @Expose
    private String collectionId;
    @SerializedName("headers")
    @Expose
    private String headers;
    @SerializedName("pathVariables")
    @Expose
    private List<Object> pathVariables = null;
    @SerializedName("rawModeData")
    @Expose
    private String rawModeData;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Object getDescription() {
        return description;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public List<Object> getData() {
        return data;
    }

    public void setData(List<Object> data) {
        this.data = data;
    }

    public String getDataMode() {
        return dataMode;
    }

    public void setDataMode(String dataMode) {
        this.dataMode = dataMode;
    }

    public List<HeaderDatum> getHeaderData() {
        return headerData;
    }

    public void setHeaderData(List<HeaderDatum> headerData) {
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

    public List<QueryParam> getQueryParams() {
        return queryParams;
    }

    public void setQueryParams(List<QueryParam> queryParams) {
        this.queryParams = queryParams;
    }

    public Auth getAuth() {
        return auth;
    }

    public void setAuth(Auth auth) {
        this.auth = auth;
    }

    public Object getEvents() {
        return events;
    }

    public void setEvents(Object events) {
        this.events = events;
    }

    public Object getFolder() {
        return folder;
    }

    public void setFolder(Object folder) {
        this.folder = folder;
    }

    public List<Response> getResponses() {
        return responses;
    }

    public void setResponses(List<Response> responses) {
        this.responses = responses;
    }

    public Object getCurrentHelper() {
        return currentHelper;
    }

    public void setCurrentHelper(Object currentHelper) {
        this.currentHelper = currentHelper;
    }

    public Object getHelperAttributes() {
        return helperAttributes;
    }

    public void setHelperAttributes(Object helperAttributes) {
        this.helperAttributes = helperAttributes;
    }

    public String getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(String collectionId) {
        this.collectionId = collectionId;
    }

    public String getHeaders() {
        return headers;
    }

    public void setHeaders(String headers) {
        this.headers = headers;
    }

    public List<Object> getPathVariables() {
        return pathVariables;
    }

    public void setPathVariables(List<Object> pathVariables) {
        this.pathVariables = pathVariables;
    }

    public String getRawModeData() {
        return rawModeData;
    }

    public void setRawModeData(String rawModeData) {
        this.rawModeData = rawModeData;
    }

}
