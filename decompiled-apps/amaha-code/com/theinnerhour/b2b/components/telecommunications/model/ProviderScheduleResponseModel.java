package com.theinnerhour.b2b.components.telecommunications.model;

import com.appsflyer.R;
import kotlin.Metadata;
import tf.b;
/* compiled from: ProviderScheduleResponseModel.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/theinnerhour/b2b/components/telecommunications/model/ProviderScheduleResponseModel;", "", "()V", "date", "", "getDate", "()Ljava/lang/String;", "slotsAvailable", "", "getSlotsAvailable", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class ProviderScheduleResponseModel {
    @b("date")
    private final String date;
    @b("available_slots")
    private final Integer slotsAvailable;

    public final String getDate() {
        return this.date;
    }

    public final Integer getSlotsAvailable() {
        return this.slotsAvailable;
    }
}
