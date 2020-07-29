/*
 * Copyright 2020 Softcom Limited.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ng.softcom.android.utils.ui

import android.content.Context
import android.content.Intent
import androidx.activity.ComponentActivity
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders

/**
 * Get a view model from the view model factory.
 *
 * @param T The view model class.
 * @param viewModelFactory The view model factory.
 *
 * @return The view model.
 */
inline fun <reified T : ViewModel> FragmentActivity.obtainViewModel(viewModelFactory: ViewModelProvider.Factory) =
    ViewModelProviders.of(this, viewModelFactory).get(T::class.java)

/** Create an intent used to navigate to another activity
 * @param block code to configure the intent
 */
inline fun <reified T : ComponentActivity> createIntent(
    context: Context,
    block: Intent.() -> Unit
): Intent {
    return Intent(context, T::class.java).apply(block)
}
