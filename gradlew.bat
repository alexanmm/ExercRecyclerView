<?xml version="1.0" encoding="utf-8"?>
<!-- Copyright (C) 2014 The Android Open Source Project

     Licensed under the Apache License, Version 2.0 (the "License");
     you may not use this file except in compliance with the License.
     You may obtain a copy of the License at

          http://www.apache.org/licenses/LICENSE-2.0

     Unless required by applicable law or agreed to in writing, software
     distributed under the License is distributed on an "AS IS" BASIS,
     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     See the License for the specific language governing permissions and
     limitations under the License.
-->

<android.support.v7.widget.ActionBarOverlayLayout
        xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:id="@+id/decor_content_parent"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:fitsSystemWindows="true">

    <include layout="@layout/abc_screen_content_include"/>

    <android.support.v7.widget.ActionBarContainer
            android:id="@+id/action_bar_container"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_alignParentTop="true"
            style="?attr/actionBarStyle"
            android:touchscreenBlocksFocus="true"
            android:gravity="top">

        <android.support.v7.widget.Toolbar
                android:id="@+id/action_bar"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                app:navigationContentDescription="@string/abc_action_bar_up_description"
                style="?attr/toolbarStyle"/>

        <android.support.v7.widget.ActionBarContextView
                android:id="@+id/action_context_bar"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:visibility="gone"
                android:theme="?attr/actionBarTheme"
                style="?attr/actionModeStyle"/>

    </android.support.v7.widget.ActionBarContainer>

</android.support.v7.widget.ActionBarOverlayLayout>
        