/*
 * Copyright (c) 2013 ITOCHU Techno-Solutions Corporation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package jp.co.ctc_g.jse.vid.adaptor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.Principal;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Map;

import javax.servlet.AsyncContext;
import javax.servlet.DispatcherType;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

@SuppressWarnings({
    "rawtypes", "unchecked"
})
public class HttpServletRequestAdaptor implements HttpServletRequest {

    public String getAuthType() {

        return null;
    }

    public String getContextPath() {

        return null;
    }

    public Cookie[] getCookies() {

        return null;
    }

    public long getDateHeader(String name) {

        return 0;
    }

    public String getHeader(String name) {

        return null;
    }

    public Enumeration getHeaderNames() {

        return null;
    }

    public Enumeration getHeaders(String name) {

        return null;
    }

    public int getIntHeader(String name) {

        return 0;
    }

    public String getMethod() {

        return null;
    }

    public String getPathInfo() {

        return null;
    }

    public String getPathTranslated() {

        return null;
    }

    public String getQueryString() {

        return null;
    }

    public String getRemoteUser() {

        return null;
    }

    public String getRequestURI() {

        return null;
    }

    public StringBuffer getRequestURL() {

        return null;
    }

    public String getRequestedSessionId() {

        return null;
    }

    public String getServletPath() {

        return null;
    }

    public HttpSession getSession() {

        return null;
    }

    public HttpSession getSession(boolean create) {

        return null;
    }

    public Principal getUserPrincipal() {

        return null;
    }

    public boolean isRequestedSessionIdFromCookie() {

        return false;
    }

    public boolean isRequestedSessionIdFromURL() {

        return false;
    }

    public boolean isRequestedSessionIdFromUrl() {

        return false;
    }

    public boolean isRequestedSessionIdValid() {

        return false;
    }

    public boolean isUserInRole(String role) {

        return false;
    }

    public Object getAttribute(String name) {

        return null;
    }

    public Enumeration getAttributeNames() {

        return null;
    }

    public String getCharacterEncoding() {

        return null;
    }

    public int getContentLength() {

        return 0;
    }

    public String getContentType() {

        return null;
    }

    public ServletInputStream getInputStream() throws IOException {

        return null;
    }

    public String getLocalAddr() {

        return null;
    }

    public String getLocalName() {

        return null;
    }

    public int getLocalPort() {

        return 0;
    }

    public Locale getLocale() {

        return null;
    }

    public Enumeration getLocales() {

        return null;
    }

    public String getParameter(String name) {

        return null;
    }

    public Map getParameterMap() {

        return null;
    }

    public Enumeration getParameterNames() {

        return null;
    }

    public String[] getParameterValues(String name) {

        return null;
    }

    public String getProtocol() {

        return null;
    }

    public BufferedReader getReader() throws IOException {

        return null;
    }

    public String getRealPath(String path) {

        return null;
    }

    public String getRemoteAddr() {

        return null;
    }

    public String getRemoteHost() {

        return null;
    }

    public int getRemotePort() {

        return 0;
    }

    public RequestDispatcher getRequestDispatcher(String path) {

        return null;
    }

    public String getScheme() {

        return null;
    }

    public String getServerName() {

        return null;
    }

    public int getServerPort() {

        return 0;
    }

    public boolean isSecure() {

        return false;
    }

    public void removeAttribute(String name) {

    }

    public void setAttribute(String name, Object o) {

    }

    public void setCharacterEncoding(String env) throws UnsupportedEncodingException {

    }

    @Override
    public ServletContext getServletContext() {
        return null;
    }

    @Override
    public AsyncContext startAsync() throws IllegalStateException {
        return null;
    }

    @Override
    public AsyncContext startAsync(ServletRequest servletRequest, ServletResponse servletResponse) throws IllegalStateException {
        return null;
    }

    @Override
    public boolean isAsyncStarted() {

        return false;
    }

    @Override
    public boolean isAsyncSupported() {

        return false;
    }

    @Override
    public AsyncContext getAsyncContext() {

        return null;
    }

    @Override
    public DispatcherType getDispatcherType() {

        return null;
    }

    @Override
    public boolean authenticate(HttpServletResponse response) throws IOException, ServletException {

        return false;
    }

    @Override
    public void login(String username, String password) throws ServletException {

    }

    @Override
    public void logout() throws ServletException {

    }

    @Override
    public Collection<Part> getParts() throws IOException, ServletException {

        return null;
    }

    @Override
    public Part getPart(String name) throws IOException, ServletException {

        return null;
    }

}
