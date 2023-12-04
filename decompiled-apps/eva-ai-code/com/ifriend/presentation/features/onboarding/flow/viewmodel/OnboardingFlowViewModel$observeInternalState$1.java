package com.ifriend.presentation.features.onboarding.flow.viewmodel;

import com.ifriend.domain.onboarding.model.OnboardingStep;
import com.ifriend.presentation.features.onboarding.flow.viewmodel.OnboardingFlowViewModel;
import com.ifriend.ui.progress.MultiPartProgressState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OnboardingFlowViewModel.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/onboarding/flow/viewmodel/OnboardingFlowViewModel$UiState;", "internalState", "Lcom/ifriend/presentation/features/onboarding/flow/viewmodel/OnboardingFlowViewModel$InternalState;", "uiState", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OnboardingFlowViewModel$observeInternalState$1 extends Lambda implements Function2<OnboardingFlowViewModel.InternalState, OnboardingFlowViewModel.UiState, OnboardingFlowViewModel.UiState> {
    public static final OnboardingFlowViewModel$observeInternalState$1 INSTANCE = new OnboardingFlowViewModel$observeInternalState$1();

    OnboardingFlowViewModel$observeInternalState$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final OnboardingFlowViewModel.UiState invoke(OnboardingFlowViewModel.InternalState internalState, OnboardingFlowViewModel.UiState uiState) {
        List list;
        Intrinsics.checkNotNullParameter(internalState, "internalState");
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        list = OnboardingFlowViewModel.finalSteps;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : internalState.getSteps()) {
            Boolean valueOf = Boolean.valueOf(list.contains((OnboardingStep) obj));
            Object obj2 = linkedHashMap.get(valueOf);
            if (obj2 == null) {
                obj2 = (List) new ArrayList();
                linkedHashMap.put(valueOf, obj2);
            }
            ((List) obj2).add(obj);
        }
        int i = 0;
        List list2 = (List) linkedHashMap.get(false);
        if (list2 == null) {
            list2 = CollectionsKt.emptyList();
        }
        List list3 = (List) linkedHashMap.get(true);
        if (list3 == null) {
            list3 = CollectionsKt.emptyList();
        }
        Pair pair = TuplesKt.to(list2, list3);
        List list4 = (List) pair.component1();
        List list5 = (List) pair.component2();
        List take = CollectionsKt.take(internalState.getSteps(), internalState.getCurrentStepIndex());
        Iterator it = list4.iterator();
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (Intrinsics.areEqual((OnboardingStep) it.next(), internalState.getCurrentStep())) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            i = list4.size();
        }
        float size = i / list4.size();
        MultiPartProgressState.Part part = new MultiPartProgressState.Part(1.0f, Float.isNaN(size) ? 1.0f : RangesKt.coerceIn(size, 0.0f, 1.0f));
        List<OnboardingStep> list6 = list5;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list6, 10));
        for (OnboardingStep onboardingStep : list6) {
            arrayList.add(new MultiPartProgressState.Part(0.0f, take.contains(onboardingStep) ? 1.0f : 0.0f));
        }
        List createListBuilder = CollectionsKt.createListBuilder();
        createListBuilder.add(part);
        createListBuilder.addAll(arrayList);
        Unit unit = Unit.INSTANCE;
        return OnboardingFlowViewModel.UiState.copy$default(uiState, false, false, new MultiPartProgressState(CollectionsKt.build(createListBuilder)), null, !Intrinsics.areEqual(internalState.getCurrentStep(), OnboardingStep.Awesome.INSTANCE), 11, null);
    }
}
