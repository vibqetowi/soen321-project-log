package com.theinnerhour.b2b.components.introActivities.model;

import com.appsflyer.R;
import java.util.List;
import kotlin.Metadata;
/* compiled from: PositiveQualitiesActivityListener.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0016\u0010\t\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002H&J\u0016\u0010\u000b\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002H&J\u0018\u0010\u000e\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H&J\u001c\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u0007H&J\u001c\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u0007H&J\u001c\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u0003H&J\u0010\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0003H&¨\u0006\u001a"}, d2 = {"Lcom/theinnerhour/b2b/components/introActivities/model/PositiveQualitiesActivityListener;", "Lcom/theinnerhour/b2b/components/introActivities/model/IntroActivityListener;", "", "", "existList", "Lhs/k;", "setExistList", "", "userSelectedQualities", "setUserSelectedQualities", "filteredQualities", "setFilterQualities", "firstQuality", "secondQuality", "setQualities", "firstTask", "firstPlace", "setFirstPlaceAndTask", "secondTask", "secondPlace", "setSecondPlaceAndTask", "userChipFragOne", "userChipFragTwo", "setUserChip", "updateGoal", "setGoalUpdateFlag", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public interface PositiveQualitiesActivityListener extends IntroActivityListener {

    /* compiled from: PositiveQualitiesActivityListener.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void setFirstPlaceAndTask$default(PositiveQualitiesActivityListener positiveQualitiesActivityListener, String str, String str2, int i6, Object obj) {
            if (obj == null) {
                if ((i6 & 1) != 0) {
                    str = "";
                }
                if ((i6 & 2) != 0) {
                    str2 = "";
                }
                positiveQualitiesActivityListener.setFirstPlaceAndTask(str, str2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setFirstPlaceAndTask");
        }

        public static /* synthetic */ void setSecondPlaceAndTask$default(PositiveQualitiesActivityListener positiveQualitiesActivityListener, String str, String str2, int i6, Object obj) {
            if (obj == null) {
                if ((i6 & 1) != 0) {
                    str = "";
                }
                if ((i6 & 2) != 0) {
                    str2 = "";
                }
                positiveQualitiesActivityListener.setSecondPlaceAndTask(str, str2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setSecondPlaceAndTask");
        }

        public static /* synthetic */ void setUserChip$default(PositiveQualitiesActivityListener positiveQualitiesActivityListener, boolean z10, boolean z11, int i6, Object obj) {
            if (obj == null) {
                if ((i6 & 1) != 0) {
                    z10 = false;
                }
                if ((i6 & 2) != 0) {
                    z11 = false;
                }
                positiveQualitiesActivityListener.setUserChip(z10, z11);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setUserChip");
        }
    }

    void setExistList(List<Boolean> list);

    void setFilterQualities(List<String> list);

    void setFirstPlaceAndTask(String str, String str2);

    void setGoalUpdateFlag(boolean z10);

    void setQualities(String str, String str2);

    void setSecondPlaceAndTask(String str, String str2);

    void setUserChip(boolean z10, boolean z11);

    void setUserSelectedQualities(List<String> list);
}
