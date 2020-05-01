package cloud.liupeng.controller;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.common.SolrDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * @author liupeng
 */
@RestController
public class SolrController {

    @Autowired
    private SolrClient solrClient;

    @RequestMapping("/")
    public String solr() throws IOException, SolrServerException {
        SolrDocument solrClientById = solrClient.getById("id");
        return solrClientById.toString();
    }
}
