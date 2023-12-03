package com.moengage.pushbase.internal.fragments;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import androidx.annotation.Keep;
import androidx.fragment.app.n;
import com.theinnerhour.b2b.utils.SessionManager;
import hh.g;
import ij.b;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.i;
import ni.r;
import org.json.JSONObject;
@Keep
/* loaded from: classes.dex */
public class LaterDialogFragment extends n {
    private static final String TAG = "PushBase_6.6.0_LaterDialogFragment";
    private b itemSelected;

    /* loaded from: classes.dex */
    public class a implements DialogInterface.OnClickListener {

        /* renamed from: u */
        public final /* synthetic */ Map f10233u;

        /* renamed from: v */
        public final /* synthetic */ CharSequence[] f10234v;

        public a(LinkedHashMap linkedHashMap, CharSequence[] charSequenceArr) {
            LaterDialogFragment.this = r1;
            this.f10233u = linkedHashMap;
            this.f10234v = charSequenceArr;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i6) {
            LaterDialogFragment.this.itemSelected.onItemSelected(((Long) this.f10233u.get(this.f10234v[i6])).longValue());
        }
    }

    public static /* synthetic */ String lambda$onCreateDialog$0() {
        return "PushBase_6.6.0_LaterDialogFragment onCreateDialog() : onCreateDialog called.";
    }

    public static /* synthetic */ String lambda$onCreateDialog$1() {
        return "PushBase_6.6.0_LaterDialogFragment onCreateDialog()";
    }

    @Override // androidx.fragment.app.n, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        this.itemSelected.onDialogCancelled();
    }

    @Override // androidx.fragment.app.n
    public Dialog onCreateDialog(Bundle bundle) {
        int i6;
        int i10;
        String str;
        g.c(new r(20));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Bundle arguments = getArguments();
        if (arguments != null && arguments.containsKey("remindLater")) {
            try {
                JSONObject jSONObject = new JSONObject(arguments.getString("remindLater"));
                JSONObject jSONObject2 = jSONObject.getJSONObject("kvPairs");
                i.f(jSONObject.getString(SessionManager.KEY_NAME), "actionJson.getString(NAME)");
                int optInt = jSONObject2.optInt("remindAfterHours", -1);
                int optInt2 = jSONObject2.optInt("remindTomorrowAt", -1);
                String str2 = "PM";
                if (optInt != -1) {
                    int i11 = optInt + Calendar.getInstance().get(11);
                    if (i11 > 12) {
                        i10 = i11 - 12;
                    } else {
                        i10 = i11;
                    }
                    StringBuilder sb2 = new StringBuilder("Today (");
                    sb2.append(i10);
                    sb2.append(":");
                    sb2.append(Calendar.getInstance().get(12));
                    if (i11 > 11) {
                        str = "PM";
                    } else {
                        str = "AM";
                    }
                    sb2.append(str);
                    sb2.append(")");
                    String sb3 = sb2.toString();
                    Calendar calendar = Calendar.getInstance();
                    calendar.add(12, optInt2 * 60);
                    linkedHashMap.put(sb3, Long.valueOf(calendar.getTimeInMillis()));
                }
                if (optInt2 != -1) {
                    Calendar calendar2 = Calendar.getInstance();
                    calendar2.add(5, 1);
                    calendar2.set(11, optInt2);
                    calendar2.set(12, 0);
                    if (optInt2 > 12) {
                        i6 = optInt2 - 12;
                    } else {
                        i6 = optInt2;
                    }
                    StringBuilder sb4 = new StringBuilder("Tomorrow (");
                    sb4.append(i6);
                    if (optInt2 <= 11) {
                        str2 = "AM";
                    }
                    sb4.append(str2);
                    sb4.append(")");
                    linkedHashMap.put(sb4.toString(), Long.valueOf(calendar2.getTimeInMillis()));
                }
            } catch (Exception e10) {
                r rVar = new r(21);
                hh.a aVar = g.f17610d;
                g.a.a(1, e10, rVar);
            }
        } else {
            arguments = new Bundle();
        }
        arguments.putBoolean("moe_re_notify", true);
        linkedHashMap.put("Pick a date and time", -1L);
        CharSequence[] charSequenceArr = (CharSequence[]) linkedHashMap.keySet().toArray(new CharSequence[linkedHashMap.size()]);
        AlertDialog.Builder builder = new AlertDialog.Builder(new ContextThemeWrapper(getActivity(), 16973939));
        builder.setTitle("Later").setItems(charSequenceArr, new a(linkedHashMap, charSequenceArr));
        return builder.create();
    }

    public void setItemSelected(b bVar) {
        this.itemSelected = bVar;
    }
}
