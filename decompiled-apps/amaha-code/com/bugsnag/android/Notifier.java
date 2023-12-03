package com.bugsnag.android;

import com.bugsnag.android.JsonStream;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.SessionManager;
import is.w;
import java.util.List;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
/* compiled from: Notifier.kt */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u00002\u00020\u0001B'\b\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0014\u001a\u00020\r\u0012\b\b\u0002\u0010\u0017\u001a\u00020\r¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00000\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\"\u0010\u0017\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u000f\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013¨\u0006\u001c"}, d2 = {"Lcom/bugsnag/android/Notifier;", "Lcom/bugsnag/android/JsonStream$Streamable;", "Lcom/bugsnag/android/JsonStream;", "writer", "Lhs/k;", "toStream", "", "dependencies", "Ljava/util/List;", "getDependencies", "()Ljava/util/List;", "setDependencies", "(Ljava/util/List;)V", "", SessionManager.KEY_NAME, "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "version", "getVersion", "setVersion", Constants.NOTIFICATION_URL, "getUrl", "setUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class Notifier implements JsonStream.Streamable {
    private List<Notifier> dependencies;
    private String name;
    private String url;
    private String version;

    public Notifier() {
        this(null, null, null, 7, null);
    }

    public final List<Notifier> getDependencies() {
        return this.dependencies;
    }

    public final String getName() {
        return this.name;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getVersion() {
        return this.version;
    }

    public final void setDependencies(List<Notifier> list) {
        i.h(list, "<set-?>");
        this.dependencies = list;
    }

    public final void setName(String str) {
        i.h(str, "<set-?>");
        this.name = str;
    }

    public final void setUrl(String str) {
        i.h(str, "<set-?>");
        this.url = str;
    }

    public final void setVersion(String str) {
        i.h(str, "<set-?>");
        this.version = str;
    }

    @Override // com.bugsnag.android.JsonStream.Streamable
    public void toStream(JsonStream writer) {
        i.h(writer, "writer");
        writer.beginObject();
        writer.name(SessionManager.KEY_NAME).value(this.name);
        writer.name("version").value(this.version);
        writer.name(Constants.NOTIFICATION_URL).value(this.url);
        if (!this.dependencies.isEmpty()) {
            writer.name("dependencies");
            writer.beginArray();
            for (Notifier notifier : this.dependencies) {
                writer.value(notifier);
            }
            writer.endArray();
        }
        writer.endObject();
    }

    public Notifier(String str) {
        this(str, null, null, 6, null);
    }

    public Notifier(String str, String str2) {
        this(str, str2, null, 4, null);
    }

    public Notifier(String name, String version, String url) {
        i.h(name, "name");
        i.h(version, "version");
        i.h(url, "url");
        this.name = name;
        this.version = version;
        this.url = url;
        this.dependencies = w.f20676u;
    }

    public /* synthetic */ Notifier(String str, String str2, String str3, int i6, d dVar) {
        this((i6 & 1) != 0 ? "Android Bugsnag Notifier" : str, (i6 & 2) != 0 ? "5.29.0" : str2, (i6 & 4) != 0 ? "https://bugsnag.com" : str3);
    }
}
