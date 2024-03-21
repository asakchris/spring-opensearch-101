## Spring Boot OpenSearch 101

#### Start OpenSearch Cluster
```shell
docker compose up -d
```

#### View OpenSearch Dashboard
- Navigate to http://localhost:5601/ for OpenSearch Dashboards
- Login with the default username (admin) and password (OnePlusOneEquals2)
- Run below commands in DevTools:
```shell
# List all indices
GET /_cat/indices?v

# Get mappings of an index
GET /persons/_mapping

# Search document by id in an index
GET /persons/_doc/1

# Search all documents in an index
POST /persons/_search
{
  "query": {
    "match_all": {}
  }
}
```