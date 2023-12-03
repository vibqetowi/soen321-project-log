package tc;

import android.text.TextUtils;
import com.google.firebase.abt.AbtException;
import java.text.ParseException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import wc.a;
/* compiled from: FirebaseABTesting.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final re.b<wc.a> f32988a;

    /* renamed from: b  reason: collision with root package name */
    public final String f32989b = "frc";

    /* renamed from: c  reason: collision with root package name */
    public Integer f32990c = null;

    public b(re.b bVar) {
        this.f32988a = bVar;
    }

    public final List<a.b> a() {
        return this.f32988a.get().g(this.f32989b);
    }

    public final void b(ArrayList arrayList) {
        String str;
        re.b<wc.a> bVar = this.f32988a;
        if (bVar.get() != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Map map = (Map) it.next();
                String[] strArr = a.f32981g;
                ArrayList arrayList3 = new ArrayList();
                String[] strArr2 = a.f32981g;
                for (int i6 = 0; i6 < 5; i6++) {
                    String str2 = strArr2[i6];
                    if (!map.containsKey(str2)) {
                        arrayList3.add(str2);
                    }
                }
                if (arrayList3.isEmpty()) {
                    try {
                        Date parse = a.f32982h.parse((String) map.get("experimentStartTime"));
                        long parseLong = Long.parseLong((String) map.get("triggerTimeoutMillis"));
                        long parseLong2 = Long.parseLong((String) map.get("timeToLiveMillis"));
                        String str3 = (String) map.get("experimentId");
                        String str4 = (String) map.get("variantId");
                        if (map.containsKey("triggerEvent")) {
                            str = (String) map.get("triggerEvent");
                        } else {
                            str = "";
                        }
                        arrayList2.add(new a(str3, str4, str, parse, parseLong, parseLong2));
                    } catch (NumberFormatException e10) {
                        throw new AbtException("Could not process experiment: one of the durations could not be converted into a long.", e10);
                    } catch (ParseException e11) {
                        throw new AbtException("Could not process experiment: parsing experiment start time failed.", e11);
                    }
                } else {
                    throw new AbtException(String.format("The following keys are missing from the experiment info map: %s", arrayList3));
                }
            }
            if (arrayList2.isEmpty()) {
                if (bVar.get() != null) {
                    for (a.b bVar2 : a()) {
                        bVar.get().e(bVar2.f36666b);
                    }
                    return;
                }
                throw new AbtException("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
            }
            HashSet hashSet = new HashSet();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                hashSet.add(((a) it2.next()).f32983a);
            }
            List<a.b> a10 = a();
            HashSet hashSet2 = new HashSet();
            for (a.b bVar3 : a10) {
                hashSet2.add(bVar3.f36666b);
            }
            ArrayList<a.b> arrayList4 = new ArrayList();
            for (a.b bVar4 : a10) {
                if (!hashSet.contains(bVar4.f36666b)) {
                    arrayList4.add(bVar4);
                }
            }
            for (a.b bVar5 : arrayList4) {
                bVar.get().e(bVar5.f36666b);
            }
            ArrayList arrayList5 = new ArrayList();
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                a aVar = (a) it3.next();
                if (!hashSet2.contains(aVar.f32983a)) {
                    arrayList5.add(aVar);
                }
            }
            ArrayDeque arrayDeque = new ArrayDeque(a());
            Integer num = this.f32990c;
            String str5 = this.f32989b;
            if (num == null) {
                this.f32990c = Integer.valueOf(bVar.get().c(str5));
            }
            int intValue = this.f32990c.intValue();
            Iterator it4 = arrayList5.iterator();
            while (it4.hasNext()) {
                a aVar2 = (a) it4.next();
                while (arrayDeque.size() >= intValue) {
                    bVar.get().e(((a.b) arrayDeque.pollFirst()).f36666b);
                }
                aVar2.getClass();
                a.b bVar6 = new a.b();
                bVar6.f36665a = str5;
                bVar6.f36676m = aVar2.f32986d.getTime();
                bVar6.f36666b = aVar2.f32983a;
                bVar6.f36667c = aVar2.f32984b;
                String str6 = aVar2.f32985c;
                if (TextUtils.isEmpty(str6)) {
                    str6 = null;
                }
                bVar6.f36668d = str6;
                bVar6.f36669e = aVar2.f32987e;
                bVar6.f36673j = aVar2.f;
                bVar.get().d(bVar6);
                arrayDeque.offer(bVar6);
            }
            return;
        }
        throw new AbtException("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
    }
}
