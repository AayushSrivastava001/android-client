/*
 * Copyright 2024 Mifos Initiative
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * See https://github.com/openMF/android-client/blob/master/LICENSE.md
 */
package com.mifos.feature.search

import com.mifos.core.objects.SearchedEntity

data class SearchUiState(
    val isLoading: Boolean = false,
    val error: String? = null,
    val searchedEntities: List<SearchedEntity> = emptyList(),
)
