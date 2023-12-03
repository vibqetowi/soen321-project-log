package a0;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: KeyFrames.java */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap<String, Constructor<? extends d>> f43b;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<Integer, ArrayList<d>> f44a = new HashMap<>();

    static {
        HashMap<String, Constructor<? extends d>> hashMap = new HashMap<>();
        f43b = hashMap;
        try {
            hashMap.put("KeyAttribute", e.class.getConstructor(new Class[0]));
            hashMap.put("KeyPosition", h.class.getConstructor(new Class[0]));
            hashMap.put("KeyCycle", f.class.getConstructor(new Class[0]));
            hashMap.put("KeyTimeCycle", j.class.getConstructor(new Class[0]));
            hashMap.put("KeyTrigger", k.class.getConstructor(new Class[0]));
        } catch (NoSuchMethodException e10) {
            Log.e("KeyFrames", "unable to load", e10);
        }
    }

    public g() {
    }

    public final void a(n nVar) {
        boolean z10;
        Integer valueOf = Integer.valueOf(nVar.f99c);
        HashMap<Integer, ArrayList<d>> hashMap = this.f44a;
        ArrayList<d> arrayList = hashMap.get(valueOf);
        ArrayList<d> arrayList2 = nVar.f117w;
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        ArrayList<d> arrayList3 = hashMap.get(-1);
        if (arrayList3 != null) {
            Iterator<d> it = arrayList3.iterator();
            while (it.hasNext()) {
                d next = it.next();
                String str = ((ConstraintLayout.a) nVar.f98b.getLayoutParams()).Y;
                String str2 = next.f9c;
                if (str2 != null && str != null) {
                    z10 = str.matches(str2);
                } else {
                    z10 = false;
                }
                if (z10) {
                    arrayList2.add(next);
                }
            }
        }
    }

    public final void b(d dVar) {
        Integer valueOf = Integer.valueOf(dVar.f8b);
        HashMap<Integer, ArrayList<d>> hashMap = this.f44a;
        if (!hashMap.containsKey(valueOf)) {
            hashMap.put(Integer.valueOf(dVar.f8b), new ArrayList<>());
        }
        ArrayList<d> arrayList = hashMap.get(Integer.valueOf(dVar.f8b));
        if (arrayList != null) {
            arrayList.add(dVar);
        }
    }

    public g(Context context, XmlResourceParser xmlResourceParser) {
        Exception e10;
        d dVar;
        Constructor<? extends d> constructor;
        HashMap<String, b0.a> hashMap;
        HashMap<String, b0.a> hashMap2;
        try {
            int eventType = xmlResourceParser.getEventType();
            d dVar2 = null;
            while (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3 && "KeyFrameSet".equals(xmlResourceParser.getName())) {
                        return;
                    }
                } else {
                    String name = xmlResourceParser.getName();
                    HashMap<String, Constructor<? extends d>> hashMap3 = f43b;
                    if (hashMap3.containsKey(name)) {
                        try {
                            constructor = hashMap3.get(name);
                        } catch (Exception e11) {
                            d dVar3 = dVar2;
                            e10 = e11;
                            dVar = dVar3;
                        }
                        if (constructor != null) {
                            dVar = constructor.newInstance(new Object[0]);
                            try {
                                dVar.e(context, Xml.asAttributeSet(xmlResourceParser));
                                b(dVar);
                            } catch (Exception e12) {
                                e10 = e12;
                                Log.e("KeyFrames", "unable to create ", e10);
                                dVar2 = dVar;
                                continue;
                                eventType = xmlResourceParser.next();
                            }
                            dVar2 = dVar;
                            continue;
                        } else {
                            throw new NullPointerException("Keymaker for " + name + " not found");
                            break;
                        }
                    } else if (name.equalsIgnoreCase("CustomAttribute")) {
                        if (dVar2 != null && (hashMap2 = dVar2.f10d) != null) {
                            b0.a.d(context, xmlResourceParser, hashMap2);
                            continue;
                        }
                    } else if (name.equalsIgnoreCase("CustomMethod") && dVar2 != null && (hashMap = dVar2.f10d) != null) {
                        b0.a.d(context, xmlResourceParser, hashMap);
                        continue;
                    }
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e13) {
            e13.printStackTrace();
        } catch (XmlPullParserException e14) {
            e14.printStackTrace();
        }
    }
}
