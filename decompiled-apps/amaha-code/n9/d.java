package n9;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.RemoteException;
import com.google.android.gms.cast.framework.zzar;
import com.google.android.gms.internal.cast.e4;
import com.google.android.gms.internal.cast.k1;
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
/* loaded from: classes.dex */
public final class d extends AsyncTask<Uri, Long, Bitmap> {

    /* renamed from: c  reason: collision with root package name */
    public static final p9.b f25954c = new p9.b("FetchBitmapTask");

    /* renamed from: a  reason: collision with root package name */
    public final g f25955a;

    /* renamed from: b  reason: collision with root package name */
    public final b f25956b;

    public d(Context context, int i6, int i10, b bVar) {
        g gVar;
        this.f25956b = bVar;
        Context applicationContext = context.getApplicationContext();
        c cVar = new c(this);
        p9.b bVar2 = k1.f7569a;
        try {
            gVar = k1.a(applicationContext.getApplicationContext()).s1(new da.b(this), cVar, i6, i10);
        } catch (RemoteException | zzar e10) {
            k1.f7569a.a("Unable to call %s on %s.", e10, "newFetchBitmapTaskImpl", e4.class.getSimpleName());
            gVar = null;
        }
        this.f25955a = gVar;
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Bitmap doInBackground(Uri[] uriArr) {
        Uri uri;
        g gVar;
        Uri[] uriArr2 = uriArr;
        if (uriArr2.length == 1 && (uri = uriArr2[0]) != null && (gVar = this.f25955a) != null) {
            try {
                return gVar.W(uri);
            } catch (RemoteException e10) {
                f25954c.a("Unable to call %s on %s.", e10, "doFetch", g.class.getSimpleName());
            }
        }
        return null;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        b bVar = this.f25956b;
        if (bVar != null) {
            bVar.getClass();
            a aVar = bVar.f25952e;
            if (aVar != null) {
                aVar.b(bitmap2);
            }
            bVar.f25951d = null;
        }
    }
}
