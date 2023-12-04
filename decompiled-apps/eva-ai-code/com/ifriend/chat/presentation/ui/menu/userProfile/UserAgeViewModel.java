package com.ifriend.chat.presentation.ui.menu.userProfile;

import android.view.View;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.domain.models.profile.Birthday;
import com.ifriend.domain.models.profile.user.User;
import com.ifriend.domain.useCases.AppConfigUseCase;
import com.ifriend.domain.useCases.user.change.ChangeUserAgeUseCase;
import com.ifriend.domain.useCases.user.get.GetUserUseCase;
import com.ifriend.ui.calendar.CalendarPicker;
import java.util.Calendar;
import java.util.Date;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
/* compiled from: UserAgeViewModel.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200J\u0006\u00101\u001a\u00020.J\u0012\u00102\u001a\u00020.2\b\u00103\u001a\u0004\u0018\u000104H\u0002J\u000e\u00105\u001a\u00020.2\u0006\u0010/\u001a\u000200R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001eR \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001e\"\u0004\b\"\u0010#R \u0010$\u001a\b\u0012\u0004\u0012\u00020 0\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001e\"\u0004\b&\u0010#R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010'\u001a\u0004\u0018\u00010(X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u00066"}, d2 = {"Lcom/ifriend/chat/presentation/ui/menu/userProfile/UserAgeViewModel;", "Landroidx/lifecycle/ViewModel;", "getUserUseCase", "Lcom/ifriend/domain/useCases/user/get/GetUserUseCase;", "changeUserAgeUseCase", "Lcom/ifriend/domain/useCases/user/change/ChangeUserAgeUseCase;", "router", "Lcom/ifriend/base/navigation/api/RouterProvider;", "appConfigUseCase", "Lcom/ifriend/domain/useCases/AppConfigUseCase;", "(Lcom/ifriend/domain/useCases/user/get/GetUserUseCase;Lcom/ifriend/domain/useCases/user/change/ChangeUserAgeUseCase;Lcom/ifriend/base/navigation/api/RouterProvider;Lcom/ifriend/domain/useCases/AppConfigUseCase;)V", "calendar", "Ljava/util/Calendar;", "getCalendar", "()Ljava/util/Calendar;", "setCalendar", "(Ljava/util/Calendar;)V", "dateListener", "Lcom/ifriend/ui/calendar/CalendarPicker$DateListener;", "getDateListener", "()Lcom/ifriend/ui/calendar/CalendarPicker$DateListener;", "fragment", "Lcom/ifriend/chat/presentation/ui/menu/userProfile/UserAgeFragment;", "getFragment", "()Lcom/ifriend/chat/presentation/ui/menu/userProfile/UserAgeFragment;", "setFragment", "(Lcom/ifriend/chat/presentation/ui/menu/userProfile/UserAgeFragment;)V", "isEdited", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "maxAge", "", "getMaxAge", "setMaxAge", "(Lkotlinx/coroutines/flow/MutableStateFlow;)V", "minAge", "getMinAge", "setMinAge", "savedDate", "Ljava/util/Date;", "getSavedDate", "()Ljava/util/Date;", "setSavedDate", "(Ljava/util/Date;)V", "back", "", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "init", "onUserChanged", "user", "Lcom/ifriend/domain/models/profile/user/User;", "save", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UserAgeViewModel extends ViewModel {
    public static final int $stable = 8;
    private final AppConfigUseCase appConfigUseCase;
    private Calendar calendar;
    private final ChangeUserAgeUseCase changeUserAgeUseCase;
    private final CalendarPicker.DateListener dateListener;
    private UserAgeFragment fragment;
    private final GetUserUseCase getUserUseCase;
    private final MutableStateFlow<Boolean> isEdited;
    private MutableStateFlow<Integer> maxAge;
    private MutableStateFlow<Integer> minAge;
    private final RouterProvider router;
    private Date savedDate;

    @Inject
    public UserAgeViewModel(GetUserUseCase getUserUseCase, ChangeUserAgeUseCase changeUserAgeUseCase, RouterProvider router, AppConfigUseCase appConfigUseCase) {
        Intrinsics.checkNotNullParameter(getUserUseCase, "getUserUseCase");
        Intrinsics.checkNotNullParameter(changeUserAgeUseCase, "changeUserAgeUseCase");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(appConfigUseCase, "appConfigUseCase");
        this.getUserUseCase = getUserUseCase;
        this.changeUserAgeUseCase = changeUserAgeUseCase;
        this.router = router;
        this.appConfigUseCase = appConfigUseCase;
        this.isEdited = StateFlowKt.MutableStateFlow(false);
        Calendar calendar = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(calendar, "getInstance(...)");
        this.calendar = calendar;
        this.minAge = StateFlowKt.MutableStateFlow(0);
        this.maxAge = StateFlowKt.MutableStateFlow(99);
        this.dateListener = new CalendarPicker.DateListener() { // from class: com.ifriend.chat.presentation.ui.menu.userProfile.UserAgeViewModel$dateListener$1
            @Override // com.ifriend.ui.calendar.CalendarPicker.DateListener
            public void update(CalendarPicker.CalendarDate date) {
                Intrinsics.checkNotNullParameter(date, "date");
                UserAgeViewModel.this.getCalendar().set(5, date.getDay());
                UserAgeViewModel.this.getCalendar().set(2, date.getMonth() - 1);
                UserAgeViewModel.this.getCalendar().set(1, date.getYear());
                UserAgeViewModel.this.isEdited().setValue(Boolean.valueOf(!Intrinsics.areEqual(UserAgeViewModel.this.getCalendar().getTime(), UserAgeViewModel.this.getSavedDate())));
            }
        };
    }

    public final UserAgeFragment getFragment() {
        return this.fragment;
    }

    public final void setFragment(UserAgeFragment userAgeFragment) {
        this.fragment = userAgeFragment;
    }

    public final MutableStateFlow<Boolean> isEdited() {
        return this.isEdited;
    }

    public final Calendar getCalendar() {
        return this.calendar;
    }

    public final void setCalendar(Calendar calendar) {
        Intrinsics.checkNotNullParameter(calendar, "<set-?>");
        this.calendar = calendar;
    }

    public final Date getSavedDate() {
        return this.savedDate;
    }

    public final void setSavedDate(Date date) {
        this.savedDate = date;
    }

    public final MutableStateFlow<Integer> getMinAge() {
        return this.minAge;
    }

    public final void setMinAge(MutableStateFlow<Integer> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.minAge = mutableStateFlow;
    }

    public final MutableStateFlow<Integer> getMaxAge() {
        return this.maxAge;
    }

    public final void setMaxAge(MutableStateFlow<Integer> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.maxAge = mutableStateFlow;
    }

    public final void init() {
        UserAgeViewModel userAgeViewModel = this;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(userAgeViewModel), null, null, new UserAgeViewModel$init$1(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(userAgeViewModel), null, null, new UserAgeViewModel$init$2(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onUserChanged(User user) {
        if (user == null) {
            return;
        }
        Birthday birthday = user.getBirthday();
        Date date = birthday != null ? birthday.getDate() : null;
        this.savedDate = date;
        if (date != null) {
            this.calendar.setTime(date);
        }
    }

    public final CalendarPicker.DateListener getDateListener() {
        return this.dateListener;
    }

    public final void save(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.isEdited.setValue(false);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new UserAgeViewModel$save$1(this, null), 3, null);
    }

    public final void back(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.router.getRoute().exit();
    }
}
