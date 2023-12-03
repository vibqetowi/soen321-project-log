package t4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import h4.g;
import h4.i;
import java.util.List;
import k4.v;
/* compiled from: ResourceDrawableDecoder.java */
/* loaded from: classes.dex */
public final class d implements i<Uri, Drawable> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f32408a;

    public d(Context context) {
        this.f32408a = context.getApplicationContext();
    }

    @Override // h4.i
    public final boolean a(Uri uri, g gVar) {
        return uri.getScheme().equals("android.resource");
    }

    @Override // h4.i
    public final /* bridge */ /* synthetic */ v<Drawable> b(Uri uri, int i6, int i10, g gVar) {
        return c(uri);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final v c(Uri uri) {
        Context createPackageContext;
        List<String> pathSegments;
        int parseInt;
        Drawable a10;
        String authority = uri.getAuthority();
        Context context = this.f32408a;
        if (!authority.equals(context.getPackageName())) {
            try {
                createPackageContext = context.createPackageContext(authority, 0);
            } catch (PackageManager.NameNotFoundException e10) {
                if (!authority.contains(context.getPackageName())) {
                    throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e10);
                }
            }
            pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                List<String> pathSegments2 = uri.getPathSegments();
                String authority2 = uri.getAuthority();
                String str = pathSegments2.get(0);
                String str2 = pathSegments2.get(1);
                parseInt = createPackageContext.getResources().getIdentifier(str2, str, authority2);
                if (parseInt == 0) {
                    parseInt = Resources.getSystem().getIdentifier(str2, str, "android");
                }
                if (parseInt == 0) {
                    throw new IllegalArgumentException("Failed to find resource id for: " + uri);
                }
            } else if (pathSegments.size() == 1) {
                try {
                    parseInt = Integer.parseInt(uri.getPathSegments().get(0));
                } catch (NumberFormatException e11) {
                    throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e11);
                }
            } else {
                throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
            }
            a10 = a.a(context, createPackageContext, parseInt, null);
            if (a10 != null) {
                return null;
            }
            return new c(a10, 0);
        }
        createPackageContext = context;
        pathSegments = uri.getPathSegments();
        if (pathSegments.size() != 2) {
        }
        a10 = a.a(context, createPackageContext, parseInt, null);
        if (a10 != null) {
        }
    }
}
