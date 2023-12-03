package com.theinnerhour.b2b.components.telecommunications.model;

import com.appsflyer.R;
import java.util.ArrayList;
import kotlin.Metadata;
import tf.b;
/* compiled from: TherapistDateSlotResponseModel.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\b\u0018\u00010\u0004R\u00020\u00008\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/theinnerhour/b2b/components/telecommunications/model/TherapistDateSlotResponseModel;", "", "()V", "therapistDateSlots", "Lcom/theinnerhour/b2b/components/telecommunications/model/TherapistDateSlotResponseModel$DateSlot;", "getTherapistDateSlots", "()Lcom/theinnerhour/b2b/components/telecommunications/model/TherapistDateSlotResponseModel$DateSlot;", "DateSlot", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class TherapistDateSlotResponseModel {
    @b("therapist")
    private final DateSlot therapistDateSlots;

    /* compiled from: TherapistDateSlotResponseModel.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R&\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/theinnerhour/b2b/components/telecommunications/model/TherapistDateSlotResponseModel$DateSlot;", "", "(Lcom/theinnerhour/b2b/components/telecommunications/model/TherapistDateSlotResponseModel;)V", "schedules", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getSchedules", "()Ljava/util/ArrayList;", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public final class DateSlot {
        @b("schedules")
        private final ArrayList<String> schedules = new ArrayList<>();

        public DateSlot() {
        }

        public final ArrayList<String> getSchedules() {
            return this.schedules;
        }
    }

    public final DateSlot getTherapistDateSlots() {
        return this.therapistDateSlots;
    }
}
