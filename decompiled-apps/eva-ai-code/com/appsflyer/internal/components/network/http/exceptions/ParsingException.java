package com.appsflyer.internal.components.network.http.exceptions;

import com.appsflyer.internal.br;
import java.io.IOException;
/* loaded from: classes2.dex */
public class ParsingException extends IOException {
    private final br<String> AFInAppEventParameterName;

    public ParsingException(String str, Throwable th, br<String> brVar) {
        super(str, th);
        this.AFInAppEventParameterName = brVar;
    }

    public br<String> getRawResponse() {
        return this.AFInAppEventParameterName;
    }
}
