package org.apache.http;
/* loaded from: classes5.dex */
public interface Header extends NameValuePair {
    HeaderElement[] getElements() throws ParseException;
}
