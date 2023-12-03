package w0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;
/* compiled from: InputContentInfoCompat.java */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final c f36278a;

    /* compiled from: InputContentInfoCompat.java */
    /* loaded from: classes.dex */
    public interface c {
        ClipDescription a();

        Uri b();

        void c();

        Uri d();

        Object e();
    }

    public i(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f36278a = new a(uri, clipDescription, uri2);
        } else {
            this.f36278a = new b(uri, clipDescription, uri2);
        }
    }

    /* compiled from: InputContentInfoCompat.java */
    /* loaded from: classes.dex */
    public static final class a implements c {

        /* renamed from: a  reason: collision with root package name */
        public final InputContentInfo f36279a;

        public a(Object obj) {
            this.f36279a = (InputContentInfo) obj;
        }

        @Override // w0.i.c
        public final ClipDescription a() {
            ClipDescription description;
            description = this.f36279a.getDescription();
            return description;
        }

        @Override // w0.i.c
        public final Uri b() {
            Uri contentUri;
            contentUri = this.f36279a.getContentUri();
            return contentUri;
        }

        @Override // w0.i.c
        public final void c() {
            this.f36279a.requestPermission();
        }

        @Override // w0.i.c
        public final Uri d() {
            Uri linkUri;
            linkUri = this.f36279a.getLinkUri();
            return linkUri;
        }

        @Override // w0.i.c
        public final Object e() {
            return this.f36279a;
        }

        public a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f36279a = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    public i(a aVar) {
        this.f36278a = aVar;
    }

    /* compiled from: InputContentInfoCompat.java */
    /* loaded from: classes.dex */
    public static final class b implements c {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f36280a;

        /* renamed from: b  reason: collision with root package name */
        public final ClipDescription f36281b;

        /* renamed from: c  reason: collision with root package name */
        public final Uri f36282c;

        public b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f36280a = uri;
            this.f36281b = clipDescription;
            this.f36282c = uri2;
        }

        @Override // w0.i.c
        public final ClipDescription a() {
            return this.f36281b;
        }

        @Override // w0.i.c
        public final Uri b() {
            return this.f36280a;
        }

        @Override // w0.i.c
        public final Uri d() {
            return this.f36282c;
        }

        @Override // w0.i.c
        public final Object e() {
            return null;
        }

        @Override // w0.i.c
        public final void c() {
        }
    }
}
