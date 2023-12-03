package t0;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;
/* compiled from: ContentInfoCompat.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final e f32274a;

    /* compiled from: ContentInfoCompat.java */
    /* loaded from: classes.dex */
    public static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        public final ContentInfo.Builder f32275a;

        public a(ClipData clipData, int i6) {
            this.f32275a = new ContentInfo.Builder(clipData, i6);
        }

        @Override // t0.c.b
        public final void a(Uri uri) {
            this.f32275a.setLinkUri(uri);
        }

        @Override // t0.c.b
        public final void b(int i6) {
            this.f32275a.setFlags(i6);
        }

        @Override // t0.c.b
        public final c build() {
            ContentInfo build;
            build = this.f32275a.build();
            return new c(new d(build));
        }

        @Override // t0.c.b
        public final void setExtras(Bundle bundle) {
            this.f32275a.setExtras(bundle);
        }
    }

    /* compiled from: ContentInfoCompat.java */
    /* loaded from: classes.dex */
    public interface b {
        void a(Uri uri);

        void b(int i6);

        c build();

        void setExtras(Bundle bundle);
    }

    /* compiled from: ContentInfoCompat.java */
    /* renamed from: t0.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0544c implements b {

        /* renamed from: a  reason: collision with root package name */
        public final ClipData f32276a;

        /* renamed from: b  reason: collision with root package name */
        public final int f32277b;

        /* renamed from: c  reason: collision with root package name */
        public int f32278c;

        /* renamed from: d  reason: collision with root package name */
        public Uri f32279d;

        /* renamed from: e  reason: collision with root package name */
        public Bundle f32280e;

        public C0544c(ClipData clipData, int i6) {
            this.f32276a = clipData;
            this.f32277b = i6;
        }

        @Override // t0.c.b
        public final void a(Uri uri) {
            this.f32279d = uri;
        }

        @Override // t0.c.b
        public final void b(int i6) {
            this.f32278c = i6;
        }

        @Override // t0.c.b
        public final c build() {
            return new c(new f(this));
        }

        @Override // t0.c.b
        public final void setExtras(Bundle bundle) {
            this.f32280e = bundle;
        }
    }

    /* compiled from: ContentInfoCompat.java */
    /* loaded from: classes.dex */
    public static final class d implements e {

        /* renamed from: a  reason: collision with root package name */
        public final ContentInfo f32281a;

        public d(ContentInfo contentInfo) {
            contentInfo.getClass();
            this.f32281a = contentInfo;
        }

        @Override // t0.c.e
        public final int C() {
            int flags;
            flags = this.f32281a.getFlags();
            return flags;
        }

        @Override // t0.c.e
        public final ClipData a() {
            ClipData clip;
            clip = this.f32281a.getClip();
            return clip;
        }

        @Override // t0.c.e
        public final ContentInfo b() {
            return this.f32281a;
        }

        @Override // t0.c.e
        public final int g() {
            int source;
            source = this.f32281a.getSource();
            return source;
        }

        public final String toString() {
            return "ContentInfoCompat{" + this.f32281a + "}";
        }
    }

    /* compiled from: ContentInfoCompat.java */
    /* loaded from: classes.dex */
    public interface e {
        int C();

        ClipData a();

        ContentInfo b();

        int g();
    }

    /* compiled from: ContentInfoCompat.java */
    /* loaded from: classes.dex */
    public static final class f implements e {

        /* renamed from: a  reason: collision with root package name */
        public final ClipData f32282a;

        /* renamed from: b  reason: collision with root package name */
        public final int f32283b;

        /* renamed from: c  reason: collision with root package name */
        public final int f32284c;

        /* renamed from: d  reason: collision with root package name */
        public final Uri f32285d;

        /* renamed from: e  reason: collision with root package name */
        public final Bundle f32286e;

        public f(C0544c c0544c) {
            ClipData clipData = c0544c.f32276a;
            clipData.getClass();
            this.f32282a = clipData;
            int i6 = c0544c.f32277b;
            if (i6 >= 0) {
                if (i6 <= 5) {
                    this.f32283b = i6;
                    int i10 = c0544c.f32278c;
                    if ((i10 & 1) == i10) {
                        this.f32284c = i10;
                        this.f32285d = c0544c.f32279d;
                        this.f32286e = c0544c.f32280e;
                        return;
                    }
                    throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i10) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
                }
                throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", "source", 0, 5));
            }
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", "source", 0, 5));
        }

        @Override // t0.c.e
        public final int C() {
            return this.f32284c;
        }

        @Override // t0.c.e
        public final ClipData a() {
            return this.f32282a;
        }

        @Override // t0.c.e
        public final ContentInfo b() {
            return null;
        }

        @Override // t0.c.e
        public final int g() {
            return this.f32283b;
        }

        public final String toString() {
            String str;
            String valueOf;
            Uri uri;
            String str2;
            StringBuilder sb2 = new StringBuilder("ContentInfoCompat{clip=");
            sb2.append(this.f32282a.getDescription());
            sb2.append(", source=");
            int i6 = this.f32283b;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 != 3) {
                            if (i6 != 4) {
                                if (i6 != 5) {
                                    str = String.valueOf(i6);
                                } else {
                                    str = "SOURCE_PROCESS_TEXT";
                                }
                            } else {
                                str = "SOURCE_AUTOFILL";
                            }
                        } else {
                            str = "SOURCE_DRAG_AND_DROP";
                        }
                    } else {
                        str = "SOURCE_INPUT_METHOD";
                    }
                } else {
                    str = "SOURCE_CLIPBOARD";
                }
            } else {
                str = "SOURCE_APP";
            }
            sb2.append(str);
            sb2.append(", flags=");
            int i10 = this.f32284c;
            if ((i10 & 1) != 0) {
                valueOf = "FLAG_CONVERT_TO_PLAIN_TEXT";
            } else {
                valueOf = String.valueOf(i10);
            }
            sb2.append(valueOf);
            String str3 = "";
            if (this.f32285d == null) {
                str2 = "";
            } else {
                str2 = ", hasLinkUri(" + uri.toString().length() + ")";
            }
            sb2.append(str2);
            if (this.f32286e != null) {
                str3 = ", hasExtras";
            }
            return r1.b0.b(sb2, str3, "}");
        }
    }

    public c(e eVar) {
        this.f32274a = eVar;
    }

    public final String toString() {
        return this.f32274a.toString();
    }
}
