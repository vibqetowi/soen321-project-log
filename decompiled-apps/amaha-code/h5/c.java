package h5;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.util.Log;
import com.facebook.FacebookException;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.SessionManager;
import g6.h;
import h5.q;
import java.util.Date;
import java.util.EnumSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements q.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f17194a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f17195b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f17196c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f17197d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f17198e;

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, Object obj4, int i6) {
        this.f17194a = i6;
        this.f17195b = obj;
        this.f17196c = obj2;
        this.f17197d = obj3;
        this.f17198e = obj4;
    }

    @Override // h5.q.b
    public final void a(u uVar) {
        Boolean bool;
        EnumSet<w5.b0> enumSet;
        JSONArray optJSONArray;
        int i6 = 0;
        switch (this.f17194a) {
            case 0:
                AtomicBoolean permissionsCallSucceeded = (AtomicBoolean) this.f17195b;
                Set permissions = (Set) this.f17196c;
                Set declinedPermissions = (Set) this.f17197d;
                Set expiredPermissions = (Set) this.f17198e;
                kotlin.jvm.internal.i.g(permissionsCallSucceeded, "$permissionsCallSucceeded");
                kotlin.jvm.internal.i.g(permissions, "$permissions");
                kotlin.jvm.internal.i.g(declinedPermissions, "$declinedPermissions");
                kotlin.jvm.internal.i.g(expiredPermissions, "$expiredPermissions");
                JSONObject jSONObject = uVar.f17319d;
                if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray("data")) != null) {
                    permissionsCallSucceeded.set(true);
                    int length = optJSONArray.length();
                    if (length <= 0) {
                        return;
                    }
                    while (true) {
                        int i10 = i6 + 1;
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i6);
                        if (optJSONObject != null) {
                            String optString = optJSONObject.optString("permission");
                            String status = optJSONObject.optString("status");
                            if (!w5.e0.A(optString) && !w5.e0.A(status)) {
                                kotlin.jvm.internal.i.f(status, "status");
                                Locale locale = Locale.US;
                                String e10 = ri.e.e(locale, "US", status, locale, "(this as java.lang.String).toLowerCase(locale)");
                                int hashCode = e10.hashCode();
                                if (hashCode != -1309235419) {
                                    if (hashCode != 280295099) {
                                        if (hashCode == 568196142 && e10.equals("declined")) {
                                            declinedPermissions.add(optString);
                                        }
                                        Log.w("AccessTokenManager", kotlin.jvm.internal.i.n(e10, "Unexpected status: "));
                                    } else {
                                        if (e10.equals("granted")) {
                                            permissions.add(optString);
                                        }
                                        Log.w("AccessTokenManager", kotlin.jvm.internal.i.n(e10, "Unexpected status: "));
                                    }
                                } else {
                                    if (e10.equals("expired")) {
                                        expiredPermissions.add(optString);
                                    }
                                    Log.w("AccessTokenManager", kotlin.jvm.internal.i.n(e10, "Unexpected status: "));
                                }
                            }
                        }
                        if (i10 < length) {
                            i6 = i10;
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
                break;
            case 1:
                i5.a accessTokenAppId = (i5.a) this.f17195b;
                q postRequest = (q) this.f17196c;
                i5.q appEvents = (i5.q) this.f17197d;
                i5.n flushState = (i5.n) this.f17198e;
                String str = i5.f.f19852a;
                if (!b6.a.b(i5.f.class)) {
                    try {
                        kotlin.jvm.internal.i.g(accessTokenAppId, "$accessTokenAppId");
                        kotlin.jvm.internal.i.g(postRequest, "$postRequest");
                        kotlin.jvm.internal.i.g(appEvents, "$appEvents");
                        kotlin.jvm.internal.i.g(flushState, "$flushState");
                        i5.f.e(postRequest, uVar, accessTokenAppId, flushState, appEvents);
                        return;
                    } catch (Throwable th2) {
                        b6.a.a(i5.f.class, th2);
                        return;
                    }
                }
                return;
            default:
                final g6.h this$0 = (g6.h) this.f17195b;
                final String accessToken = (String) this.f17196c;
                final Date date = (Date) this.f17197d;
                final Date date2 = (Date) this.f17198e;
                int i11 = g6.h.F;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(accessToken, "$accessToken");
                if (!this$0.f16268y.get()) {
                    n nVar = uVar.f17318c;
                    if (nVar != null) {
                        FacebookException facebookException = nVar.C;
                        if (facebookException == null) {
                            facebookException = new FacebookException();
                        }
                        this$0.M(facebookException);
                        return;
                    }
                    try {
                        JSONObject jSONObject2 = uVar.f17317b;
                        if (jSONObject2 == null) {
                            jSONObject2 = new JSONObject();
                        }
                        final String string = jSONObject2.getString("id");
                        kotlin.jvm.internal.i.f(string, "jsonObject.getString(\"id\")");
                        final h.b a10 = h.a.a(jSONObject2);
                        String string2 = jSONObject2.getString(SessionManager.KEY_NAME);
                        kotlin.jvm.internal.i.f(string2, "jsonObject.getString(\"name\")");
                        h.c cVar = this$0.B;
                        if (cVar != null) {
                            v5.a aVar = v5.a.f34812a;
                            v5.a.a(cVar.f16274v);
                        }
                        w5.p pVar = w5.p.f36526a;
                        w5.o b10 = w5.p.b(p.b());
                        if (b10 == null || (enumSet = b10.f36514c) == null) {
                            bool = null;
                        } else {
                            bool = Boolean.valueOf(enumSet.contains(w5.b0.RequireConfirm));
                        }
                        if (kotlin.jvm.internal.i.b(bool, Boolean.TRUE) && !this$0.D) {
                            this$0.D = true;
                            String string3 = this$0.getResources().getString(R.string.com_facebook_smart_login_confirmation_title);
                            kotlin.jvm.internal.i.f(string3, "resources.getString(R.string.com_facebook_smart_login_confirmation_title)");
                            String string4 = this$0.getResources().getString(R.string.com_facebook_smart_login_confirmation_continue_as);
                            kotlin.jvm.internal.i.f(string4, "resources.getString(R.string.com_facebook_smart_login_confirmation_continue_as)");
                            String string5 = this$0.getResources().getString(R.string.com_facebook_smart_login_confirmation_cancel);
                            kotlin.jvm.internal.i.f(string5, "resources.getString(R.string.com_facebook_smart_login_confirmation_cancel)");
                            String o10 = defpackage.b.o(new Object[]{string2}, 1, string4, "java.lang.String.format(format, *args)");
                            AlertDialog.Builder builder = new AlertDialog.Builder(this$0.getContext());
                            builder.setMessage(string3).setCancelable(true).setNegativeButton(o10, new DialogInterface.OnClickListener() { // from class: g6.f
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i12) {
                                    Date date3 = date;
                                    Date date4 = date2;
                                    int i13 = h.F;
                                    h this$02 = h.this;
                                    kotlin.jvm.internal.i.g(this$02, "this$0");
                                    String userId = string;
                                    kotlin.jvm.internal.i.g(userId, "$userId");
                                    h.b permissions2 = a10;
                                    kotlin.jvm.internal.i.g(permissions2, "$permissions");
                                    String accessToken2 = accessToken;
                                    kotlin.jvm.internal.i.g(accessToken2, "$accessToken");
                                    this$02.F(userId, permissions2, accessToken2, date3, date4);
                                }
                            }).setPositiveButton(string5, new g6.g(0, this$0));
                            builder.create().show();
                            return;
                        }
                        this$0.F(string, a10, accessToken, date, date2);
                        return;
                    } catch (JSONException e11) {
                        this$0.M(new FacebookException(e11));
                        return;
                    }
                }
                return;
        }
    }
}
