package com.theinnerhour.b2b.persistence;

import com.appsflyer.R;
import com.google.gson.reflect.TypeToken;
import com.theinnerhour.b2b.components.onboarding.model.ProviderListModel;
import gv.n;
import java.lang.reflect.Type;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.k;
import sf.i;
/* compiled from: ApplicationPersistenceUtils.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Ljava/util/ArrayList;", "Lcom/theinnerhour/b2b/components/onboarding/model/ProviderListModel;", "Lkotlin/collections/ArrayList;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class ApplicationPersistenceUtils$matchingTherapists$2 extends k implements ss.a<ArrayList<ProviderListModel>> {
    final /* synthetic */ ApplicationPersistence $persistence;
    final /* synthetic */ ApplicationPersistenceUtils this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApplicationPersistenceUtils$matchingTherapists$2(ApplicationPersistence applicationPersistence, ApplicationPersistenceUtils applicationPersistenceUtils) {
        super(0);
        this.$persistence = applicationPersistence;
        this.this$0 = applicationPersistenceUtils;
    }

    @Override // ss.a
    public final ArrayList<ProviderListModel> invoke() {
        i iVar;
        String string = this.$persistence.getSharedPreferences().getString(this.$persistence.getMatchingTherapistsSP(), null);
        if (string == null) {
            string = "";
        }
        if (!n.B0(string)) {
            Type type = new TypeToken<ArrayList<ProviderListModel>>() { // from class: com.theinnerhour.b2b.persistence.ApplicationPersistenceUtils$matchingTherapists$2$type$1
            }.getType();
            iVar = this.this$0.gson;
            Object c10 = iVar.c(string, type);
            kotlin.jvm.internal.i.f(c10, "{\n            val type =…Json(str, type)\n        }");
            return (ArrayList) c10;
        }
        return new ArrayList<>();
    }
}
