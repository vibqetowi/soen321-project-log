package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.collection.ArrayMap;
import androidx.core.app.SharedElementCallback;
import androidx.core.os.CancellationSignal;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewGroupCompat;
import androidx.fragment.app.DefaultSpecialEffectsController;
import androidx.fragment.app.FragmentAnim;
import androidx.fragment.app.SpecialEffectsController;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: DefaultSpecialEffectsController.kt */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0003*+,B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J(\u0010\t\u001a\u00020\u00062\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r2\u0006\u0010\u000e\u001a\u00020\fH\u0002J\u001e\u0010\u000f\u001a\u00020\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J$\u0010\u0014\u001a\u00020\u00062\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\f0\u00162\u0006\u0010\u000e\u001a\u00020\fH\u0002J@\u0010\u0018\u001a\u00020\u00062\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00112\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u001c2\u0006\u0010\u001d\u001a\u00020\u00132\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00130\u001fH\u0002JL\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00130\u001f2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00112\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u001c2\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010#\u001a\u0004\u0018\u00010\b2\b\u0010$\u001a\u0004\u0018\u00010\bH\u0002J\u0016\u0010%\u001a\u00020\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0011H\u0002J&\u0010&\u001a\u00020\u0006*\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\f0'2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00170)H\u0002¨\u0006-"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController;", "Landroidx/fragment/app/SpecialEffectsController;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "applyContainerChanges", "", "operation", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "captureTransitioningViews", "transitioningViews", "Ljava/util/ArrayList;", "Landroid/view/View;", "Lkotlin/collections/ArrayList;", ViewHierarchyConstants.VIEW_KEY, "executeOperations", "operations", "", "isPop", "", "findNamedViews", "namedViews", "", "", "startAnimations", "animationInfos", "Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;", "awaitingContainerChanges", "", "startedAnyTransition", "startedTransitions", "", "startTransitions", "transitionInfos", "Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionInfo;", "firstOut", "lastIn", "syncAnimations", "retainMatchingViews", "Landroidx/collection/ArrayMap;", "names", "", "AnimationInfo", "SpecialEffectsInfo", "TransitionInfo", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DefaultSpecialEffectsController extends SpecialEffectsController {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultSpecialEffectsController(ViewGroup container) {
        super(container);
        Intrinsics.checkNotNullParameter(container, "container");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2 */
    @Override // androidx.fragment.app.SpecialEffectsController
    public void executeOperations(List<? extends SpecialEffectsController.Operation> operations, boolean z) {
        SpecialEffectsController.Operation operation;
        ?? r2;
        boolean z2;
        boolean z3;
        Intrinsics.checkNotNullParameter(operations, "operations");
        Iterator it = operations.iterator();
        while (true) {
            operation = null;
            if (!it.hasNext()) {
                r2 = 0;
                break;
            }
            r2 = it.next();
            SpecialEffectsController.Operation operation2 = (SpecialEffectsController.Operation) r2;
            SpecialEffectsController.Operation.State.Companion companion = SpecialEffectsController.Operation.State.Companion;
            View view = operation2.getFragment().mView;
            Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
            if (companion.asOperationState(view) != SpecialEffectsController.Operation.State.VISIBLE || operation2.getFinalState() == SpecialEffectsController.Operation.State.VISIBLE) {
                z3 = false;
                continue;
            } else {
                z3 = true;
                continue;
            }
            if (z3) {
                break;
            }
        }
        SpecialEffectsController.Operation operation3 = r2;
        ListIterator<? extends SpecialEffectsController.Operation> listIterator = operations.listIterator(operations.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            SpecialEffectsController.Operation previous = listIterator.previous();
            SpecialEffectsController.Operation operation4 = previous;
            SpecialEffectsController.Operation.State.Companion companion2 = SpecialEffectsController.Operation.State.Companion;
            View view2 = operation4.getFragment().mView;
            Intrinsics.checkNotNullExpressionValue(view2, "operation.fragment.mView");
            if (companion2.asOperationState(view2) == SpecialEffectsController.Operation.State.VISIBLE || operation4.getFinalState() != SpecialEffectsController.Operation.State.VISIBLE) {
                z2 = false;
                continue;
            } else {
                z2 = true;
                continue;
            }
            if (z2) {
                operation = previous;
                break;
            }
        }
        SpecialEffectsController.Operation operation5 = operation;
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "Executing operations from " + operation3 + " to " + operation5);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        final List<SpecialEffectsController.Operation> mutableList = CollectionsKt.toMutableList((Collection) operations);
        syncAnimations(operations);
        Iterator<? extends SpecialEffectsController.Operation> it2 = operations.iterator();
        while (it2.hasNext()) {
            final SpecialEffectsController.Operation next = it2.next();
            CancellationSignal cancellationSignal = new CancellationSignal();
            next.markStartedSpecialEffect(cancellationSignal);
            arrayList.add(new AnimationInfo(next, cancellationSignal, z));
            CancellationSignal cancellationSignal2 = new CancellationSignal();
            next.markStartedSpecialEffect(cancellationSignal2);
            arrayList2.add(new TransitionInfo(next, cancellationSignal2, z, !z ? next != operation5 : next != operation3));
            next.addCompletionListener(new Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultSpecialEffectsController.executeOperations$lambda$2(mutableList, next, this);
                }
            });
        }
        Map<SpecialEffectsController.Operation, Boolean> startTransitions = startTransitions(arrayList2, mutableList, z, operation3, operation5);
        startAnimations(arrayList, mutableList, startTransitions.containsValue(true), startTransitions);
        for (SpecialEffectsController.Operation operation6 : mutableList) {
            applyContainerChanges(operation6);
        }
        mutableList.clear();
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "Completed executing operations from " + operation3 + " to " + operation5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void executeOperations$lambda$2(List awaitingContainerChanges, SpecialEffectsController.Operation operation, DefaultSpecialEffectsController this$0) {
        Intrinsics.checkNotNullParameter(awaitingContainerChanges, "$awaitingContainerChanges");
        Intrinsics.checkNotNullParameter(operation, "$operation");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (awaitingContainerChanges.contains(operation)) {
            awaitingContainerChanges.remove(operation);
            this$0.applyContainerChanges(operation);
        }
    }

    private final void syncAnimations(List<? extends SpecialEffectsController.Operation> list) {
        Fragment fragment = ((SpecialEffectsController.Operation) CollectionsKt.last((List<? extends Object>) list)).getFragment();
        for (SpecialEffectsController.Operation operation : list) {
            operation.getFragment().mAnimationInfo.mEnterAnim = fragment.mAnimationInfo.mEnterAnim;
            operation.getFragment().mAnimationInfo.mExitAnim = fragment.mAnimationInfo.mExitAnim;
            operation.getFragment().mAnimationInfo.mPopEnterAnim = fragment.mAnimationInfo.mPopEnterAnim;
            operation.getFragment().mAnimationInfo.mPopExitAnim = fragment.mAnimationInfo.mPopExitAnim;
        }
    }

    private final void startAnimations(List<AnimationInfo> list, List<SpecialEffectsController.Operation> list2, boolean z, Map<SpecialEffectsController.Operation, Boolean> map) {
        Context context = getContainer().getContext();
        ArrayList<AnimationInfo> arrayList = new ArrayList();
        boolean z2 = false;
        for (final AnimationInfo animationInfo : list) {
            if (animationInfo.isVisibilityUnchanged()) {
                animationInfo.completeSpecialEffect();
            } else {
                Intrinsics.checkNotNullExpressionValue(context, "context");
                FragmentAnim.AnimationOrAnimator animation = animationInfo.getAnimation(context);
                if (animation == null) {
                    animationInfo.completeSpecialEffect();
                } else {
                    final Animator animator = animation.animator;
                    if (animator == null) {
                        arrayList.add(animationInfo);
                    } else {
                        final SpecialEffectsController.Operation operation = animationInfo.getOperation();
                        Fragment fragment = operation.getFragment();
                        if (Intrinsics.areEqual((Object) map.get(operation), (Object) true)) {
                            if (FragmentManager.isLoggingEnabled(2)) {
                                Log.v(FragmentManager.TAG, "Ignoring Animator set on " + fragment + " as this Fragment was involved in a Transition.");
                            }
                            animationInfo.completeSpecialEffect();
                        } else {
                            final boolean z3 = operation.getFinalState() == SpecialEffectsController.Operation.State.GONE;
                            if (z3) {
                                list2.remove(operation);
                            }
                            final View view = fragment.mView;
                            getContainer().startViewTransition(view);
                            animator.addListener(new AnimatorListenerAdapter() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$startAnimations$1
                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                public void onAnimationEnd(Animator anim) {
                                    Intrinsics.checkNotNullParameter(anim, "anim");
                                    DefaultSpecialEffectsController.this.getContainer().endViewTransition(view);
                                    if (z3) {
                                        SpecialEffectsController.Operation.State finalState = operation.getFinalState();
                                        View viewToAnimate = view;
                                        Intrinsics.checkNotNullExpressionValue(viewToAnimate, "viewToAnimate");
                                        finalState.applyState(viewToAnimate);
                                    }
                                    animationInfo.completeSpecialEffect();
                                    if (FragmentManager.isLoggingEnabled(2)) {
                                        Log.v(FragmentManager.TAG, "Animator from operation " + operation + " has ended.");
                                    }
                                }
                            });
                            animator.setTarget(view);
                            animator.start();
                            if (FragmentManager.isLoggingEnabled(2)) {
                                Log.v(FragmentManager.TAG, "Animator from operation " + operation + " has started.");
                            }
                            animationInfo.getSignal().setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$$ExternalSyntheticLambda5
                                @Override // androidx.core.os.CancellationSignal.OnCancelListener
                                public final void onCancel() {
                                    DefaultSpecialEffectsController.startAnimations$lambda$3(animator, operation);
                                }
                            });
                            z2 = true;
                        }
                    }
                }
            }
        }
        for (final AnimationInfo animationInfo2 : arrayList) {
            final SpecialEffectsController.Operation operation2 = animationInfo2.getOperation();
            Fragment fragment2 = operation2.getFragment();
            if (z) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(FragmentManager.TAG, "Ignoring Animation set on " + fragment2 + " as Animations cannot run alongside Transitions.");
                }
                animationInfo2.completeSpecialEffect();
            } else if (z2) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(FragmentManager.TAG, "Ignoring Animation set on " + fragment2 + " as Animations cannot run alongside Animators.");
                }
                animationInfo2.completeSpecialEffect();
            } else {
                final View view2 = fragment2.mView;
                Intrinsics.checkNotNullExpressionValue(context, "context");
                FragmentAnim.AnimationOrAnimator animation2 = animationInfo2.getAnimation(context);
                if (animation2 == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                Animation animation3 = animation2.animation;
                if (animation3 == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                if (operation2.getFinalState() != SpecialEffectsController.Operation.State.REMOVED) {
                    view2.startAnimation(animation3);
                    animationInfo2.completeSpecialEffect();
                } else {
                    getContainer().startViewTransition(view2);
                    FragmentAnim.EndViewTransitionAnimation endViewTransitionAnimation = new FragmentAnim.EndViewTransitionAnimation(animation3, getContainer(), view2);
                    endViewTransitionAnimation.setAnimationListener(new DefaultSpecialEffectsController$startAnimations$3(operation2, this, view2, animationInfo2));
                    view2.startAnimation(endViewTransitionAnimation);
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "Animation from operation " + operation2 + " has started.");
                    }
                }
                animationInfo2.getSignal().setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$$ExternalSyntheticLambda6
                    @Override // androidx.core.os.CancellationSignal.OnCancelListener
                    public final void onCancel() {
                        DefaultSpecialEffectsController.startAnimations$lambda$4(view2, this, animationInfo2, operation2);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startAnimations$lambda$3(Animator animator, SpecialEffectsController.Operation operation) {
        Intrinsics.checkNotNullParameter(operation, "$operation");
        animator.end();
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "Animator from operation " + operation + " has been canceled.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startAnimations$lambda$4(View view, DefaultSpecialEffectsController this$0, AnimationInfo animationInfo, SpecialEffectsController.Operation operation) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(animationInfo, "$animationInfo");
        Intrinsics.checkNotNullParameter(operation, "$operation");
        view.clearAnimation();
        this$0.getContainer().endViewTransition(view);
        animationInfo.completeSpecialEffect();
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "Animation from operation " + operation + " has been cancelled.");
        }
    }

    private final Map<SpecialEffectsController.Operation, Boolean> startTransitions(List<TransitionInfo> list, List<SpecialEffectsController.Operation> list2, final boolean z, final SpecialEffectsController.Operation operation, final SpecialEffectsController.Operation operation2) {
        Object obj;
        View view;
        View view2;
        Iterator<TransitionInfo> it;
        Object obj2;
        Object obj3;
        View view3;
        Object obj4;
        Object obj5;
        ArrayList<View> arrayList;
        LinkedHashMap linkedHashMap;
        final ArrayList<View> arrayList2;
        View view4;
        LinkedHashMap linkedHashMap2;
        View view5;
        Rect rect;
        List<TransitionInfo> list3;
        View view6;
        LinkedHashMap linkedHashMap3;
        View view7;
        Rect rect2;
        Pair pair;
        FragmentTransitionImpl fragmentTransitionImpl;
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        Object obj6;
        final FragmentTransitionImpl fragmentTransitionImpl2;
        final Rect rect3;
        final View view8;
        DefaultSpecialEffectsController defaultSpecialEffectsController = this;
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        List<TransitionInfo> list4 = list;
        ArrayList arrayList5 = new ArrayList();
        for (Object obj7 : list4) {
            if (!((TransitionInfo) obj7).isVisibilityUnchanged()) {
                arrayList5.add(obj7);
            }
        }
        ArrayList<TransitionInfo> arrayList6 = new ArrayList();
        for (Object obj8 : arrayList5) {
            if (((TransitionInfo) obj8).getHandlingImpl() != null) {
                arrayList6.add(obj8);
            }
        }
        FragmentTransitionImpl fragmentTransitionImpl3 = null;
        for (TransitionInfo transitionInfo : arrayList6) {
            FragmentTransitionImpl handlingImpl = transitionInfo.getHandlingImpl();
            if (!(fragmentTransitionImpl3 == null || handlingImpl == fragmentTransitionImpl3)) {
                throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + transitionInfo.getOperation().getFragment() + " returned Transition " + transitionInfo.getTransition() + " which uses a different Transition type than other Fragments.").toString());
            }
            fragmentTransitionImpl3 = handlingImpl;
        }
        if (fragmentTransitionImpl3 == null) {
            for (TransitionInfo transitionInfo2 : list) {
                linkedHashMap4.put(transitionInfo2.getOperation(), false);
                transitionInfo2.completeSpecialEffect();
            }
            return linkedHashMap4;
        }
        View view9 = new View(getContainer().getContext());
        Rect rect4 = new Rect();
        ArrayList<View> arrayList7 = new ArrayList<>();
        ArrayList<View> arrayList8 = new ArrayList<>();
        ArrayMap arrayMap = new ArrayMap();
        boolean z2 = false;
        View view10 = null;
        loop4: while (true) {
            obj = null;
            for (TransitionInfo transitionInfo3 : list) {
                if (!transitionInfo3.hasSharedElementTransition() || operation == null || operation2 == null) {
                    Rect rect5 = rect4;
                    linkedHashMap2 = linkedHashMap4;
                    view5 = view9;
                    rect = rect5;
                    arrayList7 = arrayList7;
                    fragmentTransitionImpl3 = fragmentTransitionImpl3;
                    arrayList8 = arrayList8;
                    list4 = list4;
                    view10 = view10;
                    arrayMap = arrayMap;
                } else {
                    Object wrapTransitionInSet = fragmentTransitionImpl3.wrapTransitionInSet(fragmentTransitionImpl3.cloneTransition(transitionInfo3.getSharedElementTransition()));
                    ArrayList<String> sharedElementSourceNames = operation2.getFragment().getSharedElementSourceNames();
                    list3 = list4;
                    Intrinsics.checkNotNullExpressionValue(sharedElementSourceNames, "lastIn.fragment.sharedElementSourceNames");
                    ArrayList<String> sharedElementSourceNames2 = operation.getFragment().getSharedElementSourceNames();
                    view6 = view10;
                    Intrinsics.checkNotNullExpressionValue(sharedElementSourceNames2, "firstOut.fragment.sharedElementSourceNames");
                    ArrayList<String> sharedElementTargetNames = operation.getFragment().getSharedElementTargetNames();
                    linkedHashMap3 = linkedHashMap4;
                    Intrinsics.checkNotNullExpressionValue(sharedElementTargetNames, "firstOut.fragment.sharedElementTargetNames");
                    int size = sharedElementTargetNames.size();
                    view7 = view9;
                    rect2 = rect4;
                    int i = 0;
                    while (i < size) {
                        int i2 = size;
                        int indexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i));
                        if (indexOf != -1) {
                            sharedElementSourceNames.set(indexOf, sharedElementSourceNames2.get(i));
                        }
                        i++;
                        size = i2;
                    }
                    ArrayList<String> sharedElementTargetNames2 = operation2.getFragment().getSharedElementTargetNames();
                    Intrinsics.checkNotNullExpressionValue(sharedElementTargetNames2, "lastIn.fragment.sharedElementTargetNames");
                    if (!z) {
                        pair = TuplesKt.to(operation.getFragment().getExitTransitionCallback(), operation2.getFragment().getEnterTransitionCallback());
                    } else {
                        pair = TuplesKt.to(operation.getFragment().getEnterTransitionCallback(), operation2.getFragment().getExitTransitionCallback());
                    }
                    SharedElementCallback sharedElementCallback = (SharedElementCallback) pair.component1();
                    SharedElementCallback sharedElementCallback2 = (SharedElementCallback) pair.component2();
                    int size2 = sharedElementSourceNames.size();
                    int i3 = 0;
                    while (i3 < size2) {
                        arrayMap.put(sharedElementSourceNames.get(i3), sharedElementTargetNames2.get(i3));
                        i3++;
                        wrapTransitionInSet = wrapTransitionInSet;
                        size2 = size2;
                        fragmentTransitionImpl3 = fragmentTransitionImpl3;
                    }
                    fragmentTransitionImpl = fragmentTransitionImpl3;
                    Object obj9 = wrapTransitionInSet;
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, ">>> entering view names <<<");
                        Iterator<String> it2 = sharedElementTargetNames2.iterator();
                        while (it2.hasNext()) {
                            Log.v(FragmentManager.TAG, "Name: " + it2.next());
                        }
                        Log.v(FragmentManager.TAG, ">>> exiting view names <<<");
                        Iterator<String> it3 = sharedElementSourceNames.iterator();
                        while (it3.hasNext()) {
                            Log.v(FragmentManager.TAG, "Name: " + it3.next());
                        }
                    }
                    ArrayMap<String, View> arrayMap2 = new ArrayMap<>();
                    ArrayMap<String, View> arrayMap3 = arrayMap2;
                    View view11 = operation.getFragment().mView;
                    Intrinsics.checkNotNullExpressionValue(view11, "firstOut.fragment.mView");
                    defaultSpecialEffectsController.findNamedViews(arrayMap3, view11);
                    ArrayList<String> arrayList9 = sharedElementSourceNames;
                    arrayMap2.retainAll(arrayList9);
                    if (sharedElementCallback != null) {
                        if (FragmentManager.isLoggingEnabled(2)) {
                            arrayList3 = arrayList9;
                            Log.v(FragmentManager.TAG, "Executing exit callback for operation " + operation);
                        } else {
                            arrayList3 = arrayList9;
                        }
                        sharedElementCallback.onMapSharedElements(sharedElementSourceNames, arrayMap3);
                        int size3 = sharedElementSourceNames.size() - 1;
                        if (size3 >= 0) {
                            while (true) {
                                int i4 = size3 - 1;
                                String str = sharedElementSourceNames.get(size3);
                                View view12 = arrayMap2.get(str);
                                if (view12 == null) {
                                    arrayMap.remove(str);
                                } else if (!Intrinsics.areEqual(str, ViewCompat.getTransitionName(view12))) {
                                    arrayMap.put(ViewCompat.getTransitionName(view12), (String) arrayMap.remove(str));
                                }
                                if (i4 < 0) {
                                    break;
                                }
                                size3 = i4;
                            }
                        }
                    } else {
                        arrayList3 = arrayList9;
                        arrayMap.retainAll(arrayMap2.keySet());
                    }
                    final ArrayMap<String, View> arrayMap4 = new ArrayMap<>();
                    ArrayMap<String, View> arrayMap5 = arrayMap4;
                    View view13 = operation2.getFragment().mView;
                    Intrinsics.checkNotNullExpressionValue(view13, "lastIn.fragment.mView");
                    defaultSpecialEffectsController.findNamedViews(arrayMap5, view13);
                    ArrayList<String> arrayList10 = sharedElementTargetNames2;
                    arrayMap4.retainAll(arrayList10);
                    arrayMap4.retainAll(arrayMap.values());
                    if (sharedElementCallback2 != null) {
                        if (FragmentManager.isLoggingEnabled(2)) {
                            arrayList4 = arrayList10;
                            Log.v(FragmentManager.TAG, "Executing enter callback for operation " + operation2);
                        } else {
                            arrayList4 = arrayList10;
                        }
                        sharedElementCallback2.onMapSharedElements(sharedElementTargetNames2, arrayMap5);
                        int size4 = sharedElementTargetNames2.size() - 1;
                        if (size4 >= 0) {
                            while (true) {
                                int i5 = size4 - 1;
                                String name = sharedElementTargetNames2.get(size4);
                                View view14 = arrayMap4.get(name);
                                if (view14 == null) {
                                    Intrinsics.checkNotNullExpressionValue(name, "name");
                                    String findKeyForValue = FragmentTransition.findKeyForValue(arrayMap, name);
                                    if (findKeyForValue != null) {
                                        arrayMap.remove(findKeyForValue);
                                    }
                                } else if (!Intrinsics.areEqual(name, ViewCompat.getTransitionName(view14))) {
                                    Intrinsics.checkNotNullExpressionValue(name, "name");
                                    String findKeyForValue2 = FragmentTransition.findKeyForValue(arrayMap, name);
                                    if (findKeyForValue2 != null) {
                                        arrayMap.put(findKeyForValue2, ViewCompat.getTransitionName(view14));
                                    }
                                }
                                if (i5 < 0) {
                                    break;
                                }
                                size4 = i5;
                            }
                        }
                    } else {
                        arrayList4 = arrayList10;
                        FragmentTransition.retainValues(arrayMap, arrayMap4);
                    }
                    Set keySet = arrayMap.keySet();
                    Intrinsics.checkNotNullExpressionValue(keySet, "sharedElementNameMapping.keys");
                    defaultSpecialEffectsController.retainMatchingViews(arrayMap2, keySet);
                    Collection<String> values = arrayMap.values();
                    Intrinsics.checkNotNullExpressionValue(values, "sharedElementNameMapping.values");
                    defaultSpecialEffectsController.retainMatchingViews(arrayMap4, values);
                    if (arrayMap.isEmpty()) {
                        break;
                    }
                    FragmentTransition.callSharedElementStartEnd(operation2.getFragment(), operation.getFragment(), z, arrayMap2, true);
                    OneShotPreDrawListener.add(getContainer(), new Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$$ExternalSyntheticLambda1
                        @Override // java.lang.Runnable
                        public final void run() {
                            DefaultSpecialEffectsController.startTransitions$lambda$9(SpecialEffectsController.Operation.this, operation, z, arrayMap4);
                        }
                    });
                    arrayList7.addAll(arrayMap2.values());
                    if (!arrayList3.isEmpty()) {
                        View view15 = arrayMap2.get(sharedElementSourceNames.get(0));
                        obj6 = obj9;
                        fragmentTransitionImpl2 = fragmentTransitionImpl;
                        fragmentTransitionImpl2.setEpicenter(obj6, view15);
                        view6 = view15;
                    } else {
                        obj6 = obj9;
                        fragmentTransitionImpl2 = fragmentTransitionImpl;
                    }
                    arrayList8.addAll(arrayMap4.values());
                    if (!(!arrayList4.isEmpty()) || (view8 = arrayMap4.get(sharedElementTargetNames2.get(0))) == null) {
                        rect3 = rect2;
                        view5 = view7;
                    } else {
                        rect3 = rect2;
                        OneShotPreDrawListener.add(getContainer(), new Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$$ExternalSyntheticLambda2
                            @Override // java.lang.Runnable
                            public final void run() {
                                DefaultSpecialEffectsController.startTransitions$lambda$10(FragmentTransitionImpl.this, view8, rect3);
                            }
                        });
                        view5 = view7;
                        z2 = true;
                    }
                    fragmentTransitionImpl2.setSharedElementTargets(obj6, view5, arrayList7);
                    ArrayList<View> arrayList11 = arrayList8;
                    rect = rect3;
                    fragmentTransitionImpl2.scheduleRemoveTargets(obj6, null, null, null, null, obj6, arrayList11);
                    linkedHashMap2 = linkedHashMap3;
                    linkedHashMap2.put(operation, true);
                    linkedHashMap2.put(operation2, true);
                    arrayList7 = arrayList7;
                    obj = obj6;
                    arrayList8 = arrayList11;
                    list4 = list3;
                    arrayMap = arrayMap;
                    fragmentTransitionImpl3 = fragmentTransitionImpl2;
                    view10 = view6;
                }
                Rect rect6 = rect;
                view9 = view5;
                linkedHashMap4 = linkedHashMap2;
                rect4 = rect6;
            }
            arrayList7.clear();
            arrayList8.clear();
            rect4 = rect2;
            list4 = list3;
            view10 = view6;
            linkedHashMap4 = linkedHashMap3;
            view9 = view7;
            fragmentTransitionImpl3 = fragmentTransitionImpl;
        }
        List<TransitionInfo> list5 = list4;
        View view16 = view10;
        FragmentTransitionImpl fragmentTransitionImpl4 = fragmentTransitionImpl3;
        ArrayMap arrayMap6 = arrayMap;
        ArrayList<View> arrayList12 = arrayList8;
        ArrayList<View> arrayList13 = arrayList7;
        Rect rect7 = rect4;
        LinkedHashMap linkedHashMap5 = linkedHashMap4;
        View view17 = view9;
        ArrayList arrayList14 = new ArrayList();
        Iterator<TransitionInfo> it4 = list.iterator();
        Object obj10 = null;
        Object obj11 = null;
        while (it4.hasNext()) {
            TransitionInfo next = it4.next();
            if (next.isVisibilityUnchanged()) {
                it = it4;
                linkedHashMap5.put(next.getOperation(), false);
                next.completeSpecialEffect();
                obj2 = obj;
            } else {
                it = it4;
                Object cloneTransition = fragmentTransitionImpl4.cloneTransition(next.getTransition());
                SpecialEffectsController.Operation operation3 = next.getOperation();
                boolean z3 = obj != null && (operation3 == operation || operation3 == operation2);
                if (cloneTransition == null) {
                    obj2 = obj;
                    if (!z3) {
                        linkedHashMap5.put(operation3, false);
                        next.completeSpecialEffect();
                    }
                } else {
                    Object obj12 = obj;
                    ArrayList<View> arrayList15 = new ArrayList<>();
                    Object obj13 = obj10;
                    View view18 = operation3.getFragment().mView;
                    Object obj14 = obj11;
                    Intrinsics.checkNotNullExpressionValue(view18, "operation.fragment.mView");
                    defaultSpecialEffectsController.captureTransitioningViews(arrayList15, view18);
                    if (z3) {
                        if (operation3 == operation) {
                            arrayList15.removeAll(CollectionsKt.toSet(arrayList13));
                        } else {
                            arrayList15.removeAll(CollectionsKt.toSet(arrayList12));
                        }
                    }
                    if (arrayList15.isEmpty()) {
                        fragmentTransitionImpl4.addTarget(cloneTransition, view17);
                        obj3 = obj13;
                        view3 = view17;
                        arrayList = arrayList13;
                        arrayList2 = arrayList15;
                        linkedHashMap = linkedHashMap5;
                        obj4 = obj12;
                        obj5 = obj14;
                    } else {
                        fragmentTransitionImpl4.addTargets(cloneTransition, arrayList15);
                        obj3 = obj13;
                        view3 = view17;
                        obj4 = obj12;
                        obj5 = obj14;
                        arrayList = arrayList13;
                        linkedHashMap = linkedHashMap5;
                        fragmentTransitionImpl4.scheduleRemoveTargets(cloneTransition, cloneTransition, arrayList15, null, null, null, null);
                        if (operation3.getFinalState() == SpecialEffectsController.Operation.State.GONE) {
                            operation3 = operation3;
                            list2.remove(operation3);
                            arrayList2 = arrayList15;
                            ArrayList<View> arrayList16 = new ArrayList<>(arrayList2);
                            arrayList16.remove(operation3.getFragment().mView);
                            fragmentTransitionImpl4.scheduleHideFragmentView(cloneTransition, operation3.getFragment().mView, arrayList16);
                            OneShotPreDrawListener.add(getContainer(), new Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$$ExternalSyntheticLambda3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    DefaultSpecialEffectsController.startTransitions$lambda$11(arrayList2);
                                }
                            });
                        } else {
                            arrayList2 = arrayList15;
                            operation3 = operation3;
                        }
                    }
                    if (operation3.getFinalState() == SpecialEffectsController.Operation.State.VISIBLE) {
                        arrayList14.addAll(arrayList2);
                        if (z2) {
                            fragmentTransitionImpl4.setEpicenter(cloneTransition, rect7);
                        }
                        view4 = view16;
                    } else {
                        view4 = view16;
                        fragmentTransitionImpl4.setEpicenter(cloneTransition, view4);
                    }
                    linkedHashMap.put(operation3, true);
                    if (next.isOverlapAllowed()) {
                        Object mergeTransitionsTogether = fragmentTransitionImpl4.mergeTransitionsTogether(obj5, cloneTransition, null);
                        it4 = it;
                        obj11 = mergeTransitionsTogether;
                        obj = obj4;
                        linkedHashMap5 = linkedHashMap;
                        view16 = view4;
                        obj10 = obj3;
                        view17 = view3;
                        arrayList13 = arrayList;
                        defaultSpecialEffectsController = this;
                    } else {
                        obj11 = obj5;
                        obj = obj4;
                        linkedHashMap5 = linkedHashMap;
                        view16 = view4;
                        view17 = view3;
                        arrayList13 = arrayList;
                        defaultSpecialEffectsController = this;
                        obj10 = fragmentTransitionImpl4.mergeTransitionsTogether(obj3, cloneTransition, null);
                        it4 = it;
                    }
                }
            }
            it4 = it;
            obj = obj2;
        }
        ArrayList<View> arrayList17 = arrayList13;
        Object obj15 = obj;
        LinkedHashMap linkedHashMap6 = linkedHashMap5;
        Object mergeTransitionsInSequence = fragmentTransitionImpl4.mergeTransitionsInSequence(obj11, obj10, obj15);
        if (mergeTransitionsInSequence == null) {
            return linkedHashMap6;
        }
        ArrayList<TransitionInfo> arrayList18 = new ArrayList();
        for (Object obj16 : list5) {
            if (!((TransitionInfo) obj16).isVisibilityUnchanged()) {
                arrayList18.add(obj16);
            }
        }
        for (final TransitionInfo transitionInfo4 : arrayList18) {
            Object transition = transitionInfo4.getTransition();
            final SpecialEffectsController.Operation operation4 = transitionInfo4.getOperation();
            boolean z4 = obj15 != null && (operation4 == operation || operation4 == operation2);
            if (transition != null || z4) {
                if (!ViewCompat.isLaidOut(getContainer())) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "SpecialEffectsController: Container " + getContainer() + " has not been laid out. Completing operation " + operation4);
                    }
                    transitionInfo4.completeSpecialEffect();
                } else {
                    fragmentTransitionImpl4.setListenerForTransitionEnd(transitionInfo4.getOperation().getFragment(), mergeTransitionsInSequence, transitionInfo4.getSignal(), new Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$$ExternalSyntheticLambda4
                        @Override // java.lang.Runnable
                        public final void run() {
                            DefaultSpecialEffectsController.startTransitions$lambda$14$lambda$13(DefaultSpecialEffectsController.TransitionInfo.this, operation4);
                        }
                    });
                }
            }
        }
        if (ViewCompat.isLaidOut(getContainer())) {
            ArrayList arrayList19 = arrayList14;
            FragmentTransition.setViewVisibility(arrayList19, 4);
            ArrayList<String> prepareSetNameOverridesReordered = fragmentTransitionImpl4.prepareSetNameOverridesReordered(arrayList12);
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, ">>>>> Beginning transition <<<<<");
                Log.v(FragmentManager.TAG, ">>>>> SharedElementFirstOutViews <<<<<");
                Iterator<View> it5 = arrayList17.iterator();
                while (it5.hasNext()) {
                    View sharedElementFirstOutViews = it5.next();
                    Intrinsics.checkNotNullExpressionValue(sharedElementFirstOutViews, "sharedElementFirstOutViews");
                    Log.v(FragmentManager.TAG, "View: " + sharedElementFirstOutViews + " Name: " + ViewCompat.getTransitionName(view2));
                }
                Log.v(FragmentManager.TAG, ">>>>> SharedElementLastInViews <<<<<");
                Iterator<View> it6 = arrayList12.iterator();
                while (it6.hasNext()) {
                    View sharedElementLastInViews = it6.next();
                    Intrinsics.checkNotNullExpressionValue(sharedElementLastInViews, "sharedElementLastInViews");
                    Log.v(FragmentManager.TAG, "View: " + sharedElementLastInViews + " Name: " + ViewCompat.getTransitionName(view));
                }
            }
            fragmentTransitionImpl4.beginDelayedTransition(getContainer(), mergeTransitionsInSequence);
            fragmentTransitionImpl4.setNameOverridesReordered(getContainer(), arrayList17, arrayList12, prepareSetNameOverridesReordered, arrayMap6);
            FragmentTransition.setViewVisibility(arrayList19, 0);
            fragmentTransitionImpl4.swapSharedElementTargets(obj15, arrayList17, arrayList12);
            return linkedHashMap6;
        }
        return linkedHashMap6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startTransitions$lambda$9(SpecialEffectsController.Operation operation, SpecialEffectsController.Operation operation2, boolean z, ArrayMap lastInViews) {
        Intrinsics.checkNotNullParameter(lastInViews, "$lastInViews");
        FragmentTransition.callSharedElementStartEnd(operation.getFragment(), operation2.getFragment(), z, lastInViews, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startTransitions$lambda$10(FragmentTransitionImpl impl, View view, Rect lastInEpicenterRect) {
        Intrinsics.checkNotNullParameter(impl, "$impl");
        Intrinsics.checkNotNullParameter(lastInEpicenterRect, "$lastInEpicenterRect");
        impl.getBoundsOnScreen(view, lastInEpicenterRect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startTransitions$lambda$11(ArrayList transitioningViews) {
        Intrinsics.checkNotNullParameter(transitioningViews, "$transitioningViews");
        FragmentTransition.setViewVisibility(transitioningViews, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startTransitions$lambda$14$lambda$13(TransitionInfo transitionInfo, SpecialEffectsController.Operation operation) {
        Intrinsics.checkNotNullParameter(transitionInfo, "$transitionInfo");
        Intrinsics.checkNotNullParameter(operation, "$operation");
        transitionInfo.completeSpecialEffect();
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "Transition for operation " + operation + " has completed");
        }
    }

    private final void retainMatchingViews(ArrayMap<String, View> arrayMap, Collection<String> collection) {
        Set<Map.Entry<String, View>> entries = arrayMap.entrySet();
        Intrinsics.checkNotNullExpressionValue(entries, "entries");
        CollectionsKt.retainAll(entries, new DefaultSpecialEffectsController$retainMatchingViews$1(collection));
    }

    private final void captureTransitioningViews(ArrayList<View> arrayList, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (ViewGroupCompat.isTransitionGroup(viewGroup)) {
                if (arrayList.contains(view)) {
                    return;
                }
                arrayList.add(view);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View child = viewGroup.getChildAt(i);
                if (child.getVisibility() == 0) {
                    Intrinsics.checkNotNullExpressionValue(child, "child");
                    captureTransitioningViews(arrayList, child);
                }
            }
        } else if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    private final void findNamedViews(Map<String, View> map, View view) {
        String transitionName = ViewCompat.getTransitionName(view);
        if (transitionName != null) {
            map.put(transitionName, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View child = viewGroup.getChildAt(i);
                if (child.getVisibility() == 0) {
                    Intrinsics.checkNotNullExpressionValue(child, "child");
                    findNamedViews(map, child);
                }
            }
        }
    }

    private final void applyContainerChanges(SpecialEffectsController.Operation operation) {
        View view = operation.getFragment().mView;
        SpecialEffectsController.Operation.State finalState = operation.getFinalState();
        Intrinsics.checkNotNullExpressionValue(view, "view");
        finalState.applyState(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultSpecialEffectsController.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\b\u0012\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u000e\u001a\u00020\u000fR\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$SpecialEffectsInfo;", "", "operation", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "signal", "Landroidx/core/os/CancellationSignal;", "(Landroidx/fragment/app/SpecialEffectsController$Operation;Landroidx/core/os/CancellationSignal;)V", "isVisibilityUnchanged", "", "()Z", "getOperation", "()Landroidx/fragment/app/SpecialEffectsController$Operation;", "getSignal", "()Landroidx/core/os/CancellationSignal;", "completeSpecialEffect", "", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static class SpecialEffectsInfo {
        private final SpecialEffectsController.Operation operation;
        private final CancellationSignal signal;

        public SpecialEffectsInfo(SpecialEffectsController.Operation operation, CancellationSignal signal) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            Intrinsics.checkNotNullParameter(signal, "signal");
            this.operation = operation;
            this.signal = signal;
        }

        public final SpecialEffectsController.Operation getOperation() {
            return this.operation;
        }

        public final CancellationSignal getSignal() {
            return this.signal;
        }

        public final boolean isVisibilityUnchanged() {
            SpecialEffectsController.Operation.State.Companion companion = SpecialEffectsController.Operation.State.Companion;
            View view = this.operation.getFragment().mView;
            Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
            SpecialEffectsController.Operation.State asOperationState = companion.asOperationState(view);
            SpecialEffectsController.Operation.State finalState = this.operation.getFinalState();
            return asOperationState == finalState || !(asOperationState == SpecialEffectsController.Operation.State.VISIBLE || finalState == SpecialEffectsController.Operation.State.VISIBLE);
        }

        public final void completeSpecialEffect() {
            this.operation.completeSpecialEffect(this.signal);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultSpecialEffectsController.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\u000eR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;", "Landroidx/fragment/app/DefaultSpecialEffectsController$SpecialEffectsInfo;", "operation", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "signal", "Landroidx/core/os/CancellationSignal;", "isPop", "", "(Landroidx/fragment/app/SpecialEffectsController$Operation;Landroidx/core/os/CancellationSignal;Z)V", "animation", "Landroidx/fragment/app/FragmentAnim$AnimationOrAnimator;", "isAnimLoaded", "getAnimation", "context", "Landroid/content/Context;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class AnimationInfo extends SpecialEffectsInfo {
        private FragmentAnim.AnimationOrAnimator animation;
        private boolean isAnimLoaded;
        private final boolean isPop;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnimationInfo(SpecialEffectsController.Operation operation, CancellationSignal signal, boolean z) {
            super(operation, signal);
            Intrinsics.checkNotNullParameter(operation, "operation");
            Intrinsics.checkNotNullParameter(signal, "signal");
            this.isPop = z;
        }

        public final FragmentAnim.AnimationOrAnimator getAnimation(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (this.isAnimLoaded) {
                return this.animation;
            }
            FragmentAnim.AnimationOrAnimator loadAnimation = FragmentAnim.loadAnimation(context, getOperation().getFragment(), getOperation().getFinalState() == SpecialEffectsController.Operation.State.VISIBLE, this.isPop);
            this.animation = loadAnimation;
            this.isAnimLoaded = true;
            return loadAnimation;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultSpecialEffectsController.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\u0014\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0011H\u0002J\u0006\u0010\u0016\u001a\u00020\u0007R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0017"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionInfo;", "Landroidx/fragment/app/DefaultSpecialEffectsController$SpecialEffectsInfo;", "operation", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "signal", "Landroidx/core/os/CancellationSignal;", "isPop", "", "providesSharedElementTransition", "(Landroidx/fragment/app/SpecialEffectsController$Operation;Landroidx/core/os/CancellationSignal;ZZ)V", "handlingImpl", "Landroidx/fragment/app/FragmentTransitionImpl;", "getHandlingImpl", "()Landroidx/fragment/app/FragmentTransitionImpl;", "isOverlapAllowed", "()Z", "sharedElementTransition", "", "getSharedElementTransition", "()Ljava/lang/Object;", "transition", "getTransition", "hasSharedElementTransition", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class TransitionInfo extends SpecialEffectsInfo {
        private final boolean isOverlapAllowed;
        private final Object sharedElementTransition;
        private final Object transition;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransitionInfo(SpecialEffectsController.Operation operation, CancellationSignal signal, boolean z, boolean z2) {
            super(operation, signal);
            Object returnTransition;
            boolean z3;
            Object obj;
            Intrinsics.checkNotNullParameter(operation, "operation");
            Intrinsics.checkNotNullParameter(signal, "signal");
            if (operation.getFinalState() == SpecialEffectsController.Operation.State.VISIBLE) {
                Fragment fragment = operation.getFragment();
                returnTransition = z ? fragment.getReenterTransition() : fragment.getEnterTransition();
            } else {
                Fragment fragment2 = operation.getFragment();
                returnTransition = z ? fragment2.getReturnTransition() : fragment2.getExitTransition();
            }
            this.transition = returnTransition;
            if (operation.getFinalState() != SpecialEffectsController.Operation.State.VISIBLE) {
                z3 = true;
            } else if (z) {
                z3 = operation.getFragment().getAllowReturnTransitionOverlap();
            } else {
                z3 = operation.getFragment().getAllowEnterTransitionOverlap();
            }
            this.isOverlapAllowed = z3;
            if (!z2) {
                obj = null;
            } else if (z) {
                obj = operation.getFragment().getSharedElementReturnTransition();
            } else {
                obj = operation.getFragment().getSharedElementEnterTransition();
            }
            this.sharedElementTransition = obj;
        }

        public final Object getTransition() {
            return this.transition;
        }

        public final boolean isOverlapAllowed() {
            return this.isOverlapAllowed;
        }

        public final Object getSharedElementTransition() {
            return this.sharedElementTransition;
        }

        public final boolean hasSharedElementTransition() {
            return this.sharedElementTransition != null;
        }

        public final FragmentTransitionImpl getHandlingImpl() {
            FragmentTransitionImpl handlingImpl = getHandlingImpl(this.transition);
            FragmentTransitionImpl handlingImpl2 = getHandlingImpl(this.sharedElementTransition);
            if (handlingImpl == null || handlingImpl2 == null || handlingImpl == handlingImpl2) {
                return handlingImpl == null ? handlingImpl2 : handlingImpl;
            }
            throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + getOperation().getFragment() + " returned Transition " + this.transition + " which uses a different Transition  type than its shared element transition " + this.sharedElementTransition).toString());
        }

        private final FragmentTransitionImpl getHandlingImpl(Object obj) {
            if (obj == null) {
                return null;
            }
            if (FragmentTransition.PLATFORM_IMPL != null && FragmentTransition.PLATFORM_IMPL.canHandle(obj)) {
                return FragmentTransition.PLATFORM_IMPL;
            }
            if (FragmentTransition.SUPPORT_IMPL != null && FragmentTransition.SUPPORT_IMPL.canHandle(obj)) {
                return FragmentTransition.SUPPORT_IMPL;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + getOperation().getFragment() + " is not a valid framework Transition or AndroidX Transition");
        }
    }
}
