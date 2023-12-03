package r1;

import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.theinnerhour.b2b.utils.SessionManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* compiled from: MediaRouteDescriptor.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final Bundle f30244a;

    /* renamed from: b  reason: collision with root package name */
    public List<String> f30245b;

    /* renamed from: c  reason: collision with root package name */
    public List<IntentFilter> f30246c;

    /* compiled from: MediaRouteDescriptor.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Bundle f30247a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<String> f30248b;

        /* renamed from: c  reason: collision with root package name */
        public ArrayList<IntentFilter> f30249c;

        public a(String str, String str2) {
            Bundle bundle = new Bundle();
            this.f30247a = bundle;
            bundle.putString("id", str);
            bundle.putString(SessionManager.KEY_NAME, str2);
        }

        public final void a(List list) {
            if (list != null) {
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        IntentFilter intentFilter = (IntentFilter) it.next();
                        if (intentFilter != null) {
                            if (this.f30249c == null) {
                                this.f30249c = new ArrayList<>();
                            }
                            if (!this.f30249c.contains(intentFilter)) {
                                this.f30249c.add(intentFilter);
                            }
                        } else {
                            throw new IllegalArgumentException("filter must not be null");
                        }
                    }
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("filters must not be null");
        }

        public final e b() {
            ArrayList<IntentFilter> arrayList = this.f30249c;
            Bundle bundle = this.f30247a;
            if (arrayList != null) {
                bundle.putParcelableArrayList("controlFilters", arrayList);
            }
            ArrayList<String> arrayList2 = this.f30248b;
            if (arrayList2 != null) {
                bundle.putStringArrayList("groupMemberIds", arrayList2);
            }
            return new e(bundle);
        }
    }

    public e(Bundle bundle) {
        this.f30244a = bundle;
    }

    public final void a() {
        if (this.f30246c == null) {
            ArrayList parcelableArrayList = this.f30244a.getParcelableArrayList("controlFilters");
            this.f30246c = parcelableArrayList;
            if (parcelableArrayList == null) {
                this.f30246c = Collections.emptyList();
            }
        }
    }

    public final List<String> b() {
        if (this.f30245b == null) {
            ArrayList<String> stringArrayList = this.f30244a.getStringArrayList("groupMemberIds");
            this.f30245b = stringArrayList;
            if (stringArrayList == null) {
                this.f30245b = Collections.emptyList();
            }
        }
        return this.f30245b;
    }

    public final Uri c() {
        String string = this.f30244a.getString("iconUri");
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final String d() {
        return this.f30244a.getString("id");
    }

    public final boolean e() {
        a();
        if (!TextUtils.isEmpty(d()) && !TextUtils.isEmpty(this.f30244a.getString(SessionManager.KEY_NAME)) && !this.f30246c.contains(null)) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MediaRouteDescriptor{ id=");
        sb2.append(d());
        sb2.append(", groupMemberIds=");
        sb2.append(b());
        sb2.append(", name=");
        Bundle bundle = this.f30244a;
        sb2.append(bundle.getString(SessionManager.KEY_NAME));
        sb2.append(", description=");
        sb2.append(bundle.getString("status"));
        sb2.append(", iconUri=");
        sb2.append(c());
        sb2.append(", isEnabled=");
        sb2.append(bundle.getBoolean("enabled", true));
        sb2.append(", connectionState=");
        sb2.append(bundle.getInt("connectionState", 0));
        sb2.append(", controlFilters=");
        a();
        sb2.append(Arrays.toString(this.f30246c.toArray()));
        sb2.append(", playbackType=");
        sb2.append(bundle.getInt("playbackType", 1));
        sb2.append(", playbackStream=");
        sb2.append(bundle.getInt("playbackStream", -1));
        sb2.append(", deviceType=");
        sb2.append(bundle.getInt("deviceType"));
        sb2.append(", volume=");
        sb2.append(bundle.getInt("volume"));
        sb2.append(", volumeMax=");
        sb2.append(bundle.getInt("volumeMax"));
        sb2.append(", volumeHandling=");
        sb2.append(bundle.getInt("volumeHandling", 0));
        sb2.append(", presentationDisplayId=");
        sb2.append(bundle.getInt("presentationDisplayId", -1));
        sb2.append(", extras=");
        sb2.append(bundle.getBundle("extras"));
        sb2.append(", isValid=");
        sb2.append(e());
        sb2.append(", minClientVersion=");
        sb2.append(bundle.getInt("minClientVersion", 1));
        sb2.append(", maxClientVersion=");
        sb2.append(bundle.getInt("maxClientVersion", SubsamplingScaleImageView.TILE_SIZE_AUTO));
        sb2.append(" }");
        return sb2.toString();
    }
}
