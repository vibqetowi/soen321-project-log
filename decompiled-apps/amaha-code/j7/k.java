package j7;

import android.content.Context;
import com.google.android.gms.internal.p000firebaseauthapi.je;
import com.theinnerhour.b2b.utils.SessionManager;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;
import su.j0;
import su.y;
/* compiled from: Uploader_Factory.java */
/* loaded from: classes.dex */
public final class k implements f7.b, je {
    public final Object A;
    public final Object B;
    public final Object C;

    /* renamed from: u  reason: collision with root package name */
    public Object f21732u;

    /* renamed from: v  reason: collision with root package name */
    public final Object f21733v;

    /* renamed from: w  reason: collision with root package name */
    public Object f21734w;

    /* renamed from: x  reason: collision with root package name */
    public Object f21735x;

    /* renamed from: y  reason: collision with root package name */
    public final Object f21736y;

    /* renamed from: z  reason: collision with root package name */
    public final Object f21737z;

    public /* synthetic */ k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        this.f21732u = obj;
        this.f21733v = obj2;
        this.f21734w = obj3;
        this.f21735x = obj4;
        this.f21736y = obj5;
        this.f21737z = obj6;
        this.A = obj7;
        this.B = obj8;
        this.C = obj9;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.je
    public final String S() {
        char c10;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("returnSecureToken", true);
        Object obj = this.B;
        if (!((com.google.android.gms.internal.p000firebaseauthapi.h) obj).f7868v.isEmpty()) {
            List list = ((com.google.android.gms.internal.p000firebaseauthapi.h) obj).f7868v;
            JSONArray jSONArray = new JSONArray();
            for (int i6 = 0; i6 < list.size(); i6++) {
                jSONArray.put(list.get(i6));
            }
            jSONObject.put("deleteProvider", jSONArray);
        }
        List list2 = ((com.google.android.gms.internal.p000firebaseauthapi.h) this.A).f7868v;
        int size = list2.size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < list2.size(); i10++) {
            String str = (String) list2.get(i10);
            int i11 = 2;
            switch (str.hashCode()) {
                case -333046776:
                    if (str.equals("DISPLAY_NAME")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 66081660:
                    if (str.equals("EMAIL")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1939891618:
                    if (str.equals("PHOTO_URL")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1999612571:
                    if (str.equals("PASSWORD")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            if (c10 != 0) {
                if (c10 != 1) {
                    if (c10 != 2) {
                        if (c10 != 3) {
                            i11 = 0;
                        } else {
                            i11 = 4;
                        }
                    } else {
                        i11 = 5;
                    }
                }
            } else {
                i11 = 1;
            }
            iArr[i10] = i11;
        }
        if (size > 0) {
            JSONArray jSONArray2 = new JSONArray();
            for (int i12 = 0; i12 < size; i12++) {
                jSONArray2.put(iArr[i12]);
            }
            jSONObject.put("deleteAttribute", jSONArray2);
        }
        String str2 = (String) this.f21732u;
        if (str2 != null) {
            jSONObject.put("idToken", str2);
        }
        String str3 = (String) this.f21734w;
        if (str3 != null) {
            jSONObject.put(SessionManager.KEY_EMAIL, str3);
        }
        String str4 = (String) this.f21735x;
        if (str4 != null) {
            jSONObject.put(SessionManager.KEY_PASS, str4);
        }
        String str5 = (String) this.f21733v;
        if (str5 != null) {
            jSONObject.put("displayName", str5);
        }
        String str6 = (String) this.f21737z;
        if (str6 != null) {
            jSONObject.put("photoUrl", str6);
        }
        String str7 = (String) this.f21736y;
        if (str7 != null) {
            jSONObject.put("oobCode", str7);
        }
        String str8 = (String) this.C;
        if (str8 != null) {
            jSONObject.put("tenantId", str8);
        }
        return jSONObject.toString();
    }

    public final k a(gt.j descriptor, List list, cu.c nameResolver, cu.e typeTable, cu.f versionRequirementTable, cu.a metadataVersion) {
        cu.f fVar;
        kotlin.jvm.internal.i.g(descriptor, "descriptor");
        kotlin.jvm.internal.i.g(nameResolver, "nameResolver");
        kotlin.jvm.internal.i.g(typeTable, "typeTable");
        kotlin.jvm.internal.i.g(versionRequirementTable, "versionRequirementTable");
        kotlin.jvm.internal.i.g(metadataVersion, "metadataVersion");
        su.l lVar = (su.l) this.f21732u;
        boolean z10 = true;
        if ((metadataVersion.f12015b != 1 || metadataVersion.f12016c < 4) ? false : false) {
            fVar = versionRequirementTable;
        } else {
            fVar = (cu.f) this.f21736y;
        }
        return new k(lVar, nameResolver, descriptor, typeTable, fVar, metadataVersion, (uu.g) this.A, (j0) this.B, list);
    }

    public final vu.l c() {
        return ((su.l) this.f21732u).f32044a;
    }

    @Override // gs.a
    public final Object get() {
        return new j((Context) ((gs.a) this.f21732u).get(), (e7.e) ((gs.a) this.f21733v).get(), (k7.d) ((gs.a) this.f21734w).get(), (m) ((gs.a) this.f21735x).get(), (Executor) ((gs.a) this.f21736y).get(), (l7.a) ((gs.a) this.f21737z).get(), (m7.a) ((gs.a) this.A).get(), (m7.a) ((gs.a) this.B).get(), (k7.c) ((gs.a) this.C).get());
    }

    public /* synthetic */ k() {
        this.A = new com.google.android.gms.internal.p000firebaseauthapi.h();
        this.B = new com.google.android.gms.internal.p000firebaseauthapi.h();
    }

    public /* synthetic */ k(su.l components, cu.c nameResolver, gt.j containingDeclaration, cu.e typeTable, cu.f versionRequirementTable, cu.a metadataVersion, uu.g gVar, j0 j0Var, List list) {
        kotlin.jvm.internal.i.g(components, "components");
        kotlin.jvm.internal.i.g(nameResolver, "nameResolver");
        kotlin.jvm.internal.i.g(containingDeclaration, "containingDeclaration");
        kotlin.jvm.internal.i.g(typeTable, "typeTable");
        kotlin.jvm.internal.i.g(versionRequirementTable, "versionRequirementTable");
        kotlin.jvm.internal.i.g(metadataVersion, "metadataVersion");
        this.f21732u = components;
        this.f21733v = nameResolver;
        this.f21734w = containingDeclaration;
        this.f21735x = typeTable;
        this.f21736y = versionRequirementTable;
        this.f21737z = metadataVersion;
        this.A = gVar;
        this.B = new j0(this, j0Var, list, "Deserializer for \"" + ((gt.j) this.f21734w).getName() + '\"', (gVar == null || (r2 = gVar.c()) == null) ? "[container not found]" : "[container not found]");
        this.C = new y(this);
    }
}
