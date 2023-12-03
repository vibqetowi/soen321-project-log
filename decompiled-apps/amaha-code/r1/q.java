package r1;

import android.media.MediaRoute2Info;
import android.media.RouteDiscoveryPreference;
import android.net.Uri;
import android.os.Bundle;
import j$.util.Collection$EL;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import r1.e;
/* compiled from: MediaRouter2Utils.java */
/* loaded from: classes.dex */
public final class q {
    public static List<String> a(List<MediaRoute2Info> list) {
        if (list == null) {
            return new ArrayList();
        }
        return (List) Collection$EL.stream(list).filter(new b(2)).map(new c(2)).collect(Collectors.toList());
    }

    public static RouteDiscoveryPreference b(f fVar) {
        fVar.a();
        k kVar = fVar.f30257b;
        kVar.a();
        if (!(!kVar.f30288b.contains(null))) {
            return new RouteDiscoveryPreference.Builder(new ArrayList(), false).build();
        }
        boolean b10 = fVar.b();
        fVar.a();
        k kVar2 = fVar.f30257b;
        kVar2.a();
        return new RouteDiscoveryPreference.Builder((List) Collection$EL.stream(kVar2.f30288b).map(new c(1)).collect(Collectors.toList()), b10).build();
    }

    public static e c(MediaRoute2Info mediaRoute2Info) {
        String id2;
        CharSequence name;
        int connectionState;
        int volumeHandling;
        int volumeMax;
        int volume;
        Bundle extras;
        CharSequence description;
        Uri iconUri;
        Bundle extras2;
        if (mediaRoute2Info == null) {
            return null;
        }
        id2 = mediaRoute2Info.getId();
        name = mediaRoute2Info.getName();
        e.a aVar = new e.a(id2, name.toString());
        connectionState = mediaRoute2Info.getConnectionState();
        Bundle bundle = aVar.f30247a;
        bundle.putInt("connectionState", connectionState);
        volumeHandling = mediaRoute2Info.getVolumeHandling();
        bundle.putInt("volumeHandling", volumeHandling);
        volumeMax = mediaRoute2Info.getVolumeMax();
        bundle.putInt("volumeMax", volumeMax);
        volume = mediaRoute2Info.getVolume();
        bundle.putInt("volume", volume);
        extras = mediaRoute2Info.getExtras();
        bundle.putBundle("extras", extras);
        bundle.putBoolean("enabled", true);
        bundle.putBoolean("canDisconnect", false);
        description = mediaRoute2Info.getDescription();
        if (description != null) {
            bundle.putString("status", description.toString());
        }
        iconUri = mediaRoute2Info.getIconUri();
        if (iconUri != null) {
            bundle.putString("iconUri", iconUri.toString());
        }
        extras2 = mediaRoute2Info.getExtras();
        if (extras2 == null || !extras2.containsKey("androidx.mediarouter.media.KEY_EXTRAS") || !extras2.containsKey("androidx.mediarouter.media.KEY_DEVICE_TYPE") || !extras2.containsKey("androidx.mediarouter.media.KEY_CONTROL_FILTERS")) {
            return null;
        }
        bundle.putBundle("extras", extras2.getBundle("androidx.mediarouter.media.KEY_EXTRAS"));
        bundle.putInt("deviceType", extras2.getInt("androidx.mediarouter.media.KEY_DEVICE_TYPE", 0));
        bundle.putInt("playbackType", extras2.getInt("androidx.mediarouter.media.KEY_PLAYBACK_TYPE", 1));
        ArrayList parcelableArrayList = extras2.getParcelableArrayList("androidx.mediarouter.media.KEY_CONTROL_FILTERS");
        if (parcelableArrayList != null) {
            aVar.a(parcelableArrayList);
        }
        return aVar.b();
    }
}
