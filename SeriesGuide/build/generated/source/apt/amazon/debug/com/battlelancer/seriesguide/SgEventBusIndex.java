package com.battlelancer.seriesguide;

import org.greenrobot.eventbus.meta.SimpleSubscriberInfo;
import org.greenrobot.eventbus.meta.SubscriberMethodInfo;
import org.greenrobot.eventbus.meta.SubscriberInfo;
import org.greenrobot.eventbus.meta.SubscriberInfoIndex;

import org.greenrobot.eventbus.ThreadMode;

import java.util.HashMap;
import java.util.Map;

/** This class is generated by EventBus, do not edit. */
public class SgEventBusIndex implements SubscriberInfoIndex {
    private static final Map<Class<?>, SubscriberInfo> SUBSCRIBER_INDEX;

    static {
        SUBSCRIBER_INDEX = new HashMap<Class<?>, SubscriberInfo>();

        putIndex(new SimpleSubscriberInfo(com.battlelancer.seriesguide.ui.TraktCommentsFragment.class, true,
                new SubscriberMethodInfo[] {
            new SubscriberMethodInfo("onEventMainThread",
                    com.battlelancer.seriesguide.util.TraktTask.TraktActionCompleteEvent.class, ThreadMode.MAIN),
        }));

        putIndex(new SimpleSubscriberInfo(com.battlelancer.seriesguide.ui.EpisodeSearchFragment.class, true,
                new SubscriberMethodInfo[] {
            new SubscriberMethodInfo("onEventMainThread",
                    com.battlelancer.seriesguide.ui.SearchActivity.SearchQueryEvent.class, ThreadMode.MAIN, 0, true),
            new SubscriberMethodInfo("onEventTabClick", com.battlelancer.seriesguide.util.TabClickEvent.class,
                    ThreadMode.MAIN),
        }));

        putIndex(new SimpleSubscriberInfo(com.battlelancer.seriesguide.ui.TvdbAddFragment.class, true,
                new SubscriberMethodInfo[] {
            new SubscriberMethodInfo("onEventMainThread",
                    com.battlelancer.seriesguide.ui.dialogs.LanguageChoiceDialogFragment.LanguageChangedEvent.class,
                            ThreadMode.MAIN),
            new SubscriberMethodInfo("onEventMainThread",
                    com.battlelancer.seriesguide.ui.SearchActivity.SearchQuerySubmitEvent.class, ThreadMode.MAIN),
        }));

        putIndex(new SimpleSubscriberInfo(com.battlelancer.seriesguide.ui.EpisodeDetailsFragment.class, true,
                new SubscriberMethodInfo[] {
            new SubscriberMethodInfo("onEventMainThread",
                    com.battlelancer.seriesguide.extensions.ExtensionManager.EpisodeActionReceivedEvent.class,
                            ThreadMode.MAIN),
            new SubscriberMethodInfo("onEventEpisodeTask",
                    com.battlelancer.seriesguide.ui.BaseNavDrawerActivity.ServiceActiveEvent.class, ThreadMode.MAIN),
            new SubscriberMethodInfo("onEventEpisodeTask",
                    com.battlelancer.seriesguide.ui.BaseNavDrawerActivity.ServiceCompletedEvent.class,
                            ThreadMode.MAIN),
        }));

        putIndex(new SimpleSubscriberInfo(com.battlelancer.seriesguide.ui.ShowsActivity.class, true,
                new SubscriberMethodInfo[] {
            new SubscriberMethodInfo("onEventMainThread",
                    com.battlelancer.seriesguide.util.RemoveShowWorkerFragment.OnRemovingShowEvent.class,
                            ThreadMode.MAIN),
            new SubscriberMethodInfo("onEventMainThread",
                    com.battlelancer.seriesguide.util.RemoveShowWorkerFragment.OnShowRemovedEvent.class,
                            ThreadMode.MAIN),
        }));

        putIndex(new SimpleSubscriberInfo(com.battlelancer.seriesguide.traktapi.TraktAuthActivity.class, true,
                new SubscriberMethodInfo[] {
            new SubscriberMethodInfo("onEventMainThread",
                    com.battlelancer.seriesguide.util.ConnectTraktTask.FinishedEvent.class, ThreadMode.MAIN),
        }));

        putIndex(new SimpleSubscriberInfo(com.battlelancer.seriesguide.ui.MoviesDiscoverFragment.class, true,
                new SubscriberMethodInfo[] {
            new SubscriberMethodInfo("onEventLanguageChanged",
                    com.battlelancer.seriesguide.ui.dialogs.MovieLocalizationDialogFragment.LocalizationChangedEvent.class,
                            ThreadMode.MAIN),
            new SubscriberMethodInfo("onEventTabClick",
                    com.battlelancer.seriesguide.ui.MoviesActivity.MoviesTabClickEvent.class, ThreadMode.MAIN),
        }));

        putIndex(new SimpleSubscriberInfo(com.battlelancer.seriesguide.ui.ShowSearchFragment.class, true,
                new SubscriberMethodInfo[] {
            new SubscriberMethodInfo("onEventMainThread",
                    com.battlelancer.seriesguide.ui.SearchActivity.SearchQueryEvent.class, ThreadMode.MAIN, 0, true),
            new SubscriberMethodInfo("onEventTabClick", com.battlelancer.seriesguide.util.TabClickEvent.class,
                    ThreadMode.MAIN),
        }));

        putIndex(new SimpleSubscriberInfo(com.battlelancer.seriesguide.ui.MoviesSearchActivity.class, true,
                new SubscriberMethodInfo[] {
            new SubscriberMethodInfo("onEventLanguageChanged",
                    com.battlelancer.seriesguide.ui.dialogs.MovieLocalizationDialogFragment.LocalizationChangedEvent.class,
                            ThreadMode.MAIN),
        }));

        putIndex(new SimpleSubscriberInfo(com.battlelancer.seriesguide.backend.CloudSetupFragment.class, true,
                new SubscriberMethodInfo[] {
            new SubscriberMethodInfo("onEventMainThread",
                    com.battlelancer.seriesguide.ui.dialogs.RemoveCloudAccountDialogFragment.CanceledEvent.class,
                            ThreadMode.MAIN),
            new SubscriberMethodInfo("onEventMainThread",
                    com.battlelancer.seriesguide.ui.dialogs.RemoveCloudAccountDialogFragment.AccountRemovedEvent.class,
                            ThreadMode.MAIN),
        }));

        putIndex(new SimpleSubscriberInfo(com.battlelancer.seriesguide.ui.MoviesBaseFragment.class, true,
                new SubscriberMethodInfo[] {
            new SubscriberMethodInfo("onEventMainThread",
                    com.battlelancer.seriesguide.settings.MoviesDistillationSettings.MoviesSortOrderChangedEvent.class,
                            ThreadMode.MAIN),
            new SubscriberMethodInfo("onEventTabClick",
                    com.battlelancer.seriesguide.ui.MoviesActivity.MoviesTabClickEvent.class, ThreadMode.MAIN),
        }));

        putIndex(new SimpleSubscriberInfo(com.battlelancer.seriesguide.ui.BaseActivity.class, true,
                new SubscriberMethodInfo[] {
            new SubscriberMethodInfo("onEvent", com.battlelancer.seriesguide.util.AddShowTask.OnShowAddedEvent.class),
            new SubscriberMethodInfo("onEvent",
                    com.battlelancer.seriesguide.util.TraktTask.TraktActionCompleteEvent.class),
            new SubscriberMethodInfo("onEventMainThread",
                    com.battlelancer.seriesguide.util.DBUtils.DatabaseErrorEvent.class, ThreadMode.MAIN),
        }));

        putIndex(new SimpleSubscriberInfo(com.battlelancer.seriesguide.ui.OverviewActivity.class, true,
                new SubscriberMethodInfo[] {
            new SubscriberMethodInfo("onEventMainThread",
                    com.battlelancer.seriesguide.util.RemoveShowWorkerFragment.OnRemovingShowEvent.class,
                            ThreadMode.MAIN),
        }));

        putIndex(new SimpleSubscriberInfo(com.battlelancer.seriesguide.ui.dialogs.MovieLocalizationDialogFragment.class,
                true, new SubscriberMethodInfo[] {
            new SubscriberMethodInfo("onEventItemsLoaded",
                    com.battlelancer.seriesguide.ui.dialogs.MovieLocalizationDialogFragment.ItemsLoadedEvent.class,
                            ThreadMode.MAIN),
        }));

        putIndex(new SimpleSubscriberInfo(com.battlelancer.seriesguide.ui.SeriesGuidePreferences.SettingsFragment.class,
                true, new SubscriberMethodInfo[] {
            new SubscriberMethodInfo("onEvent",
                    com.battlelancer.seriesguide.ui.SeriesGuidePreferences.UpdateSummariesEvent.class,
                            ThreadMode.MAIN),
        }));

        putIndex(new SimpleSubscriberInfo(com.battlelancer.seriesguide.ui.dialogs.RemoveShowDialogFragment.class, true,
                new SubscriberMethodInfo[] {
            new SubscriberMethodInfo("onEventMainThread",
                    com.battlelancer.seriesguide.ui.dialogs.RemoveShowDialogFragment.ShowTitleEvent.class,
                            ThreadMode.MAIN),
        }));

        putIndex(new SimpleSubscriberInfo(com.battlelancer.seriesguide.ui.SearchActivity.class, true,
                new SubscriberMethodInfo[] {
            new SubscriberMethodInfo("onEventMainThread",
                    com.battlelancer.seriesguide.util.RemoveShowWorkerFragment.OnRemovingShowEvent.class,
                            ThreadMode.MAIN),
            new SubscriberMethodInfo("onEventMainThread",
                    com.battlelancer.seriesguide.util.RemoveShowWorkerFragment.OnShowRemovedEvent.class,
                            ThreadMode.MAIN),
            new SubscriberMethodInfo("onEventMainThread",
                    com.battlelancer.seriesguide.ui.TvdbAddFragment.ClearSearchHistoryEvent.class, ThreadMode.MAIN),
        }));

        putIndex(new SimpleSubscriberInfo(com.battlelancer.seriesguide.ui.MoviesNowFragment.class, true,
                new SubscriberMethodInfo[] {
            new SubscriberMethodInfo("onEventTabClick",
                    com.battlelancer.seriesguide.ui.MoviesActivity.MoviesTabClickEvent.class, ThreadMode.MAIN),
        }));

        putIndex(new SimpleSubscriberInfo(com.battlelancer.seriesguide.ui.ListsFragment.class, true,
                new SubscriberMethodInfo[] {
            new SubscriberMethodInfo("onEventMainThread",
                    com.battlelancer.seriesguide.settings.ListsDistillationSettings.ListsSortOrderChangedEvent.class,
                            ThreadMode.MAIN),
        }));

        putIndex(new SimpleSubscriberInfo(com.battlelancer.seriesguide.ui.dialogs.GenericCheckInDialogFragment.class,
                true, new SubscriberMethodInfo[] {
            new SubscriberMethodInfo("onEvent",
                    com.battlelancer.seriesguide.util.TraktTask.TraktActionCompleteEvent.class),
            new SubscriberMethodInfo("onEvent",
                    com.battlelancer.seriesguide.util.TraktTask.TraktCheckInBlockedEvent.class),
        }));

        putIndex(new SimpleSubscriberInfo(com.battlelancer.seriesguide.ui.StatsFragment.class, true,
                new SubscriberMethodInfo[] {
            new SubscriberMethodInfo("onEventMainThread",
                    com.battlelancer.seriesguide.ui.StatsFragment.StatsUpdateEvent.class, ThreadMode.MAIN),
        }));

        putIndex(new SimpleSubscriberInfo(com.battlelancer.seriesguide.ui.SeasonsFragment.class, true,
                new SubscriberMethodInfo[] {
            new SubscriberMethodInfo("onEvent",
                    com.battlelancer.seriesguide.util.EpisodeTools.EpisodeTaskCompletedEvent.class, ThreadMode.MAIN),
        }));

        putIndex(new SimpleSubscriberInfo(com.battlelancer.seriesguide.ui.TraktAddFragment.class, true,
                new SubscriberMethodInfo[] {
            new SubscriberMethodInfo("onEventMainThread",
                    com.battlelancer.seriesguide.util.ShowTools.ShowChangedEvent.class, ThreadMode.MAIN),
        }));

        putIndex(new SimpleSubscriberInfo(com.battlelancer.seriesguide.ui.ListsActivity.class, true,
                new SubscriberMethodInfo[] {
            new SubscriberMethodInfo("onEventMainThread",
                    com.battlelancer.seriesguide.ui.ListsActivity.ListsChangedEvent.class, ThreadMode.MAIN),
        }));

        putIndex(new SimpleSubscriberInfo(com.battlelancer.seriesguide.dataliberation.AutoBackupFragment.class, true,
                new SubscriberMethodInfo[] {
            new SubscriberMethodInfo("onEvent",
                    com.battlelancer.seriesguide.dataliberation.DataLiberationFragment.LiberationResultEvent.class,
                            ThreadMode.MAIN),
        }));

        putIndex(new SimpleSubscriberInfo(com.battlelancer.seriesguide.ui.QuickCheckInActivity.class, true,
                new SubscriberMethodInfo[] {
            new SubscriberMethodInfo("onEvent",
                    com.battlelancer.seriesguide.ui.dialogs.GenericCheckInDialogFragment.CheckInDialogDismissedEvent.class),
            new SubscriberMethodInfo("onEvent",
                    com.battlelancer.seriesguide.util.TraktTask.TraktActionCompleteEvent.class),
        }));

        putIndex(new SimpleSubscriberInfo(com.battlelancer.seriesguide.ui.BaseNavDrawerActivity.class, true,
                new SubscriberMethodInfo[] {
            new SubscriberMethodInfo("onEventEpisodeTask",
                    com.battlelancer.seriesguide.ui.BaseNavDrawerActivity.ServiceActiveEvent.class, ThreadMode.MAIN),
            new SubscriberMethodInfo("onEventEpisodeTask",
                    com.battlelancer.seriesguide.ui.BaseNavDrawerActivity.ServiceCompletedEvent.class,
                            ThreadMode.MAIN),
        }));

        putIndex(new SimpleSubscriberInfo(com.battlelancer.seriesguide.ui.CalendarFragment.class, true,
                new SubscriberMethodInfo[] {
            new SubscriberMethodInfo("onEventTabClick", com.battlelancer.seriesguide.util.TabClickEvent.class,
                    ThreadMode.MAIN),
        }));

        putIndex(new SimpleSubscriberInfo(com.battlelancer.seriesguide.ui.OverviewFragment.class, true,
                new SubscriberMethodInfo[] {
            new SubscriberMethodInfo("onEventMainThread",
                    com.battlelancer.seriesguide.extensions.ExtensionManager.EpisodeActionReceivedEvent.class,
                            ThreadMode.MAIN),
            new SubscriberMethodInfo("onEventEpisodeTask",
                    com.battlelancer.seriesguide.ui.BaseNavDrawerActivity.ServiceActiveEvent.class, ThreadMode.MAIN),
            new SubscriberMethodInfo("onEventEpisodeTask",
                    com.battlelancer.seriesguide.ui.BaseNavDrawerActivity.ServiceCompletedEvent.class,
                            ThreadMode.MAIN),
        }));

        putIndex(new SimpleSubscriberInfo(com.battlelancer.seriesguide.ui.ShowFragment.class, true,
                new SubscriberMethodInfo[] {
            new SubscriberMethodInfo("onEventMainThread",
                    com.battlelancer.seriesguide.ui.dialogs.LanguageChoiceDialogFragment.LanguageChangedEvent.class,
                            ThreadMode.MAIN),
        }));

        putIndex(new SimpleSubscriberInfo(com.battlelancer.seriesguide.dataliberation.DataLiberationFragment.class,
                true, new SubscriberMethodInfo[] {
            new SubscriberMethodInfo("onEvent",
                    com.battlelancer.seriesguide.dataliberation.DataLiberationFragment.LiberationResultEvent.class,
                            ThreadMode.MAIN),
        }));

        putIndex(new SimpleSubscriberInfo(com.battlelancer.seriesguide.extensions.ExtensionsConfigurationFragment.class,
                true, new SubscriberMethodInfo[] {
            new SubscriberMethodInfo("onEventMainThread",
                    com.battlelancer.seriesguide.adapters.ExtensionsAdapter.ExtensionDisableRequestEvent.class,
                            ThreadMode.MAIN),
        }));

        putIndex(new SimpleSubscriberInfo(com.battlelancer.seriesguide.ui.ShowsNowFragment.class, true,
                new SubscriberMethodInfo[] {
            new SubscriberMethodInfo("onEventEpisodeTask",
                    com.battlelancer.seriesguide.util.EpisodeTools.EpisodeTaskCompletedEvent.class, ThreadMode.MAIN),
            new SubscriberMethodInfo("onEventTabClick", com.battlelancer.seriesguide.util.TabClickEvent.class,
                    ThreadMode.MAIN),
        }));

        putIndex(new SimpleSubscriberInfo(com.battlelancer.seriesguide.billing.amazon.AmazonBillingActivity.class,
                true, new SubscriberMethodInfo[] {
            new SubscriberMethodInfo("onEventMainThread",
                    com.battlelancer.seriesguide.billing.amazon.AmazonIapManager.AmazonIapMessageEvent.class,
                            ThreadMode.MAIN),
            new SubscriberMethodInfo("onEventMainThread",
                    com.battlelancer.seriesguide.billing.amazon.AmazonIapManager.AmazonIapAvailabilityEvent.class,
                            ThreadMode.MAIN),
            new SubscriberMethodInfo("onEventMainThread",
                    com.battlelancer.seriesguide.billing.amazon.AmazonIapManager.AmazonIapProductEvent.class,
                            ThreadMode.MAIN),
        }));

        putIndex(new SimpleSubscriberInfo(com.battlelancer.seriesguide.ui.MovieDetailsFragment.class, true,
                new SubscriberMethodInfo[] {
            new SubscriberMethodInfo("onEventMainThread",
                    com.battlelancer.seriesguide.extensions.ExtensionManager.MovieActionReceivedEvent.class,
                            ThreadMode.MAIN),
            new SubscriberMethodInfo("onEvent", com.battlelancer.seriesguide.util.MovieTools.MovieChangedEvent.class),
            new SubscriberMethodInfo("onEventEpisodeTask",
                    com.battlelancer.seriesguide.ui.BaseNavDrawerActivity.ServiceActiveEvent.class, ThreadMode.MAIN),
            new SubscriberMethodInfo("onEventEpisodeTask",
                    com.battlelancer.seriesguide.ui.BaseNavDrawerActivity.ServiceCompletedEvent.class,
                            ThreadMode.MAIN),
            new SubscriberMethodInfo("handleLanguageEvent",
                    com.battlelancer.seriesguide.ui.dialogs.LanguageChoiceDialogFragment.LanguageChangedEvent.class,
                            ThreadMode.MAIN),
        }));

        putIndex(new SimpleSubscriberInfo(com.battlelancer.seriesguide.ui.ShowsFragment.class, true,
                new SubscriberMethodInfo[] {
            new SubscriberMethodInfo("onEventFirstRunButton",
                    com.battlelancer.seriesguide.widgets.FirstRunView.ButtonEvent.class, ThreadMode.MAIN),
            new SubscriberMethodInfo("onEventTabClick", com.battlelancer.seriesguide.util.TabClickEvent.class,
                    ThreadMode.MAIN),
        }));

        putIndex(new SimpleSubscriberInfo(com.battlelancer.seriesguide.ui.AddFragment.class, true,
                new SubscriberMethodInfo[] {
            new SubscriberMethodInfo("onEvent", com.battlelancer.seriesguide.ui.AddFragment.OnAddingShowEvent.class,
                    ThreadMode.MAIN),
            new SubscriberMethodInfo("onEvent", com.battlelancer.seriesguide.util.AddShowTask.OnShowAddedEvent.class,
                    ThreadMode.MAIN),
            new SubscriberMethodInfo("onEvent",
                    com.battlelancer.seriesguide.util.RemoveShowWorkerFragment.OnShowRemovedEvent.class,
                            ThreadMode.MAIN),
            new SubscriberMethodInfo("onEventTabClick", com.battlelancer.seriesguide.util.TabClickEvent.class,
                    ThreadMode.MAIN),
        }));

    }

    private static void putIndex(SubscriberInfo info) {
        SUBSCRIBER_INDEX.put(info.getSubscriberClass(), info);
    }

    @Override
    public SubscriberInfo getSubscriberInfo(Class<?> subscriberClass) {
        SubscriberInfo info = SUBSCRIBER_INDEX.get(subscriberClass);
        if (info != null) {
            return info;
        } else {
            return null;
        }
    }
}
