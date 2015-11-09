/**
 * Copyright (C) 2015 The Gravitee team (http://gravitee.io)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.gravitee.repository.analytics.query;

/**
 * @author David BRASSELY (brasseld at gmail.com)
 */
public class HitsByApiKeyQueryBuilder extends AbstractQueryBuilder<HitsByApiKeyQuery> {

    protected HitsByApiKeyQueryBuilder(HitsByApiKeyQuery query) {
        super(query);
    }

    static HitsByApiKeyQueryBuilder query() {
        return new HitsByApiKeyQueryBuilder(new HitsByApiKeyQuery());
    }

    public HitsByApiKeyQueryBuilder period(DateRange dateRangeQuery) {
        query.range(dateRangeQuery);
        return this;
    }

    public HitsByApiKeyQueryBuilder interval(Interval intervalQuery) {
        query.interval(intervalQuery);
        return this;
    }

    public HitsByApiKeyQueryBuilder apiKey(String apiKey) {
        query.apiKey(apiKey);
        return this;
    }

    public HitsByApiKeyQueryBuilder type(HitsByApiKeyQuery.Type type) {
        query.type(type);
        return this;
    }
}