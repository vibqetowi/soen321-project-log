package com.appsflyer.internal;

import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
/* loaded from: classes2.dex */
public final class bl<ResponseBody> {
    final bq<ResponseBody> AFInAppEventParameterName;
    final z AFInAppEventType;
    public final ExecutorService AFKeystoreWrapper;
    public final AtomicBoolean valueOf = new AtomicBoolean(false);
    final bm values;

    public bl(z zVar, ExecutorService executorService, bm bmVar, bq<ResponseBody> bqVar) {
        this.AFInAppEventType = zVar;
        this.AFKeystoreWrapper = executorService;
        this.values = bmVar;
        this.AFInAppEventParameterName = bqVar;
    }

    /* renamed from: com.appsflyer.internal.bl$3  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass3 implements Runnable {
        private /* synthetic */ bi AFInAppEventParameterName;

        public AnonymousClass3(bi biVar) {
            this.AFInAppEventParameterName = biVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                br<String> AFInAppEventType = bl.this.values.AFInAppEventType(bl.this.AFInAppEventType);
                if (this.AFInAppEventParameterName != null) {
                    try {
                        this.AFInAppEventParameterName.values(new br(bl.this.AFInAppEventParameterName.values(AFInAppEventType.valueOf), AFInAppEventType.values, AFInAppEventType.AFKeystoreWrapper, AFInAppEventType.AFInAppEventParameterName, AFInAppEventType.AFInAppEventType));
                    } catch (JSONException e) {
                        this.AFInAppEventParameterName.values(new ParsingException(e.getMessage(), e, AFInAppEventType));
                    }
                }
            } catch (IOException e2) {
                bi biVar = this.AFInAppEventParameterName;
                if (biVar != null) {
                    biVar.values(e2);
                }
            }
        }
    }

    public final br<ResponseBody> AFKeystoreWrapper() throws IOException {
        if (!this.valueOf.getAndSet(true)) {
            br<String> AFInAppEventType = this.values.AFInAppEventType(this.AFInAppEventType);
            try {
                return new br<>(this.AFInAppEventParameterName.values(AFInAppEventType.valueOf), AFInAppEventType.values, AFInAppEventType.AFKeystoreWrapper, AFInAppEventType.AFInAppEventParameterName, AFInAppEventType.AFInAppEventType);
            } catch (JSONException e) {
                throw new ParsingException(e.getMessage(), e, AFInAppEventType);
            }
        }
        throw new IllegalStateException("Http call is already executed");
    }
}
