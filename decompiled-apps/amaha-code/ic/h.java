package ic;

import android.app.PendingIntent;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.play.core.install.InstallException;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
/* compiled from: com.google.android.play:app-update@@2.0.1 */
/* loaded from: classes.dex */
public abstract class h extends ja.a {
    public h() {
        super("com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback", 4);
    }

    @Override // ja.a
    public final boolean T1(int i6, Parcel parcel, Parcel parcel2, int i10) {
        Parcelable parcelable = null;
        if (i6 != 2) {
            if (i6 != 3) {
                return false;
            }
            Parcelable.Creator creator = Bundle.CREATOR;
            int i11 = d.f19928a;
            if (parcel.readInt() != 0) {
                parcelable = (Parcelable) creator.createFromParcel(parcel);
            }
            Bundle bundle = (Bundle) parcelable;
            int dataAvail = parcel.dataAvail();
            if (dataAvail <= 0) {
                hc.j jVar = (hc.j) this;
                jVar.f17385d.f17388a.b(jVar.f17384c);
                jVar.f17383b.a("onCompleteUpdate", new Object[0]);
                return true;
            }
            throw new BadParcelableException(defpackage.c.p("Parcel data not fully consumed, unread size: ", dataAvail));
        }
        Parcelable.Creator creator2 = Bundle.CREATOR;
        int i12 = d.f19928a;
        if (parcel.readInt() != 0) {
            parcelable = (Parcelable) creator2.createFromParcel(parcel);
        }
        Bundle bundle2 = (Bundle) parcelable;
        int dataAvail2 = parcel.dataAvail();
        if (dataAvail2 <= 0) {
            hc.j jVar2 = (hc.j) this;
            r rVar = jVar2.f17385d.f17388a;
            ya.i iVar = jVar2.f17384c;
            rVar.b(iVar);
            jVar2.f17383b.a("onRequestInfo", new Object[0]);
            if (bundle2.getInt("error.code", -2) != 0) {
                iVar.c(new InstallException(bundle2.getInt("error.code", -2)));
                return true;
            }
            int i13 = bundle2.getInt("version.code", -1);
            int i14 = bundle2.getInt("update.availability");
            bundle2.getInt("install.status", 0);
            if (bundle2.getInt("client.version.staleness", -1) != -1) {
                bundle2.getInt("client.version.staleness");
            }
            bundle2.getInt("in.app.update.priority", 0);
            bundle2.getLong("bytes.downloaded");
            bundle2.getLong("total.bytes.to.download");
            long j10 = bundle2.getLong("additional.size.required");
            hc.l lVar = jVar2.f17386e.f17391d;
            lVar.getClass();
            long a10 = hc.l.a(new File(lVar.f17392a.getFilesDir(), "assetpacks"));
            PendingIntent pendingIntent = (PendingIntent) bundle2.getParcelable("blocking.intent");
            PendingIntent pendingIntent2 = (PendingIntent) bundle2.getParcelable("nonblocking.intent");
            PendingIntent pendingIntent3 = (PendingIntent) bundle2.getParcelable("blocking.destructive.intent");
            PendingIntent pendingIntent4 = (PendingIntent) bundle2.getParcelable("nonblocking.destructive.intent");
            HashMap hashMap = new HashMap();
            ArrayList<Integer> integerArrayList = bundle2.getIntegerArrayList("update.precondition.failures:blocking.destructive.intent");
            HashSet hashSet = new HashSet();
            if (integerArrayList != null) {
                hashSet.addAll(integerArrayList);
            }
            hashMap.put("blocking.destructive.intent", hashSet);
            ArrayList<Integer> integerArrayList2 = bundle2.getIntegerArrayList("update.precondition.failures:nonblocking.destructive.intent");
            HashSet hashSet2 = new HashSet();
            if (integerArrayList2 != null) {
                hashSet2.addAll(integerArrayList2);
            }
            hashMap.put("nonblocking.destructive.intent", hashSet2);
            ArrayList<Integer> integerArrayList3 = bundle2.getIntegerArrayList("update.precondition.failures:blocking.intent");
            HashSet hashSet3 = new HashSet();
            if (integerArrayList3 != null) {
                hashSet3.addAll(integerArrayList3);
            }
            hashMap.put("blocking.intent", hashSet3);
            ArrayList<Integer> integerArrayList4 = bundle2.getIntegerArrayList("update.precondition.failures:nonblocking.intent");
            HashSet hashSet4 = new HashSet();
            if (integerArrayList4 != null) {
                hashSet4.addAll(integerArrayList4);
            }
            hashMap.put("nonblocking.intent", hashSet4);
            iVar.d(new hc.a(i13, i14, j10, a10, pendingIntent, pendingIntent2, pendingIntent3, pendingIntent4, hashMap));
            return true;
        }
        throw new BadParcelableException(defpackage.c.p("Parcel data not fully consumed, unread size: ", dataAvail2));
    }
}
