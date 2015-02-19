/*
 * Copyright (C) 2015 47 Degrees, LLC http://47deg.com hello@47deg.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.fortysevendeg.android.scaladays.ui.places

import android.widget.{LinearLayout, TextView}
import macroid.FullDsl._
import macroid.{ActivityContext, AppContext}

class PlacesInfoWindowLayout(implicit appContext: AppContext, context: ActivityContext) 
  extends PlacesInfoWindowStyles {

  var title = slot[TextView]
  
  var snippet = slot[TextView]

  val content = getUi(
    l[LinearLayout](
      w[TextView] <~ wire(title) <~ titleStyle,
      w[TextView] <~ wire(snippet) <~ snippetStyle
    ) <~ windowStyle
  )

  def layout = content
  

}