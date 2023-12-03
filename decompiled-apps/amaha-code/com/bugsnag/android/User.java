package com.bugsnag.android;

import android.util.JsonReader;
import com.bugsnag.android.JsonStream;
import kotlin.TypeCastException;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
/* compiled from: User.kt */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B-\b\u0001\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010¨\u0006\u0018"}, d2 = {"Lcom/bugsnag/android/User;", "Lcom/bugsnag/android/JsonStream$Streamable;", "Lcom/bugsnag/android/JsonStream;", "writer", "Lhs/k;", "toStream", "", "other", "", "equals", "", "hashCode", "", User.KEY_ID, "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "email", "getEmail", "name", "getName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Companion", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class User implements JsonStream.Streamable {
    public static final Companion Companion = new Companion(null);
    private static final String KEY_EMAIL = "email";
    private static final String KEY_ID = "id";
    private static final String KEY_NAME = "name";
    private final String email;

    /* renamed from: id  reason: collision with root package name */
    private final String f5920id;
    private final String name;

    /* compiled from: User.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/bugsnag/android/User$Companion;", "Lcom/bugsnag/android/JsonReadable;", "Lcom/bugsnag/android/User;", "()V", "KEY_EMAIL", "", "KEY_ID", "KEY_NAME", "fromReader", "reader", "Landroid/util/JsonReader;", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes.dex */
    public static final class Companion implements JsonReadable<User> {
        private Companion() {
        }

        public /* synthetic */ Companion(d dVar) {
            this();
        }

        @Override // com.bugsnag.android.JsonReadable
        public User fromReader(JsonReader reader) {
            i.h(reader, "reader");
            reader.beginObject();
            String str = null;
            String str2 = null;
            String str3 = null;
            while (reader.hasNext()) {
                String nextName = reader.nextName();
                String nextString = reader.nextString();
                if (nextName != null) {
                    int hashCode = nextName.hashCode();
                    if (hashCode != 3355) {
                        if (hashCode != 3373707) {
                            if (hashCode == 96619420 && nextName.equals("email")) {
                                str2 = nextString;
                            }
                        } else if (nextName.equals("name")) {
                            str3 = nextString;
                        }
                    } else if (nextName.equals(User.KEY_ID)) {
                        str = nextString;
                    }
                }
            }
            User user = new User(str, str2, str3);
            reader.endObject();
            return user;
        }
    }

    public User() {
        this(null, null, null, 7, null);
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!i.b(User.class, cls)) {
            return false;
        }
        if (obj != null) {
            User user = (User) obj;
            if (!(!i.b(this.f5920id, user.f5920id)) && !(!i.b(this.email, user.email)) && !(!i.b(this.name, user.name))) {
                return true;
            }
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bugsnag.android.User");
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getId() {
        return this.f5920id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int i6;
        int i10;
        String str = this.f5920id;
        int i11 = 0;
        if (str != null) {
            i6 = str.hashCode();
        } else {
            i6 = 0;
        }
        int i12 = i6 * 31;
        String str2 = this.email;
        if (str2 != null) {
            i10 = str2.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (i12 + i10) * 31;
        String str3 = this.name;
        if (str3 != null) {
            i11 = str3.hashCode();
        }
        return i13 + i11;
    }

    @Override // com.bugsnag.android.JsonStream.Streamable
    public void toStream(JsonStream writer) {
        i.h(writer, "writer");
        writer.beginObject();
        writer.name(KEY_ID).value(this.f5920id);
        writer.name("email").value(this.email);
        writer.name("name").value(this.name);
        writer.endObject();
    }

    public User(String str) {
        this(str, null, null, 6, null);
    }

    public User(String str, String str2) {
        this(str, str2, null, 4, null);
    }

    public User(String str, String str2, String str3) {
        this.f5920id = str;
        this.email = str2;
        this.name = str3;
    }

    public /* synthetic */ User(String str, String str2, String str3, int i6, d dVar) {
        this((i6 & 1) != 0 ? null : str, (i6 & 2) != 0 ? null : str2, (i6 & 4) != 0 ? null : str3);
    }
}
