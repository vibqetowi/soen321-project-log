package kg;

import android.content.SharedPreferences;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.hbb20.CountryCodePicker;
import java.util.ArrayList;
/* compiled from: CountryCodeAdapter.java */
/* loaded from: classes.dex */
public final class e implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f23328u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ f f23329v;

    public e(f fVar, int i6) {
        this.f23329v = fVar;
        this.f23328u = i6;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ArrayList arrayList;
        f fVar = this.f23329v;
        ArrayList arrayList2 = fVar.f23330x;
        int i6 = this.f23328u;
        if (arrayList2 != null && arrayList2.size() > i6) {
            com.hbb20.a aVar = (com.hbb20.a) fVar.f23330x.get(i6);
            CountryCodePicker countryCodePicker = fVar.A;
            CountryCodePicker countryCodePicker2 = countryCodePicker.L;
            if (countryCodePicker2.f10100g0) {
                String str = aVar.f10142u;
                SharedPreferences.Editor edit = countryCodePicker2.f10122y.getSharedPreferences(countryCodePicker2.f10116v, 0).edit();
                edit.putString(countryCodePicker2.f10108o0, str);
                edit.apply();
            }
            countryCodePicker.setSelectedCountry(aVar);
        }
        if (view != null && (arrayList = fVar.f23330x) != null && arrayList.size() > i6 && fVar.f23330x.get(i6) != null) {
            ((InputMethodManager) fVar.E.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            fVar.D.dismiss();
        }
    }
}
