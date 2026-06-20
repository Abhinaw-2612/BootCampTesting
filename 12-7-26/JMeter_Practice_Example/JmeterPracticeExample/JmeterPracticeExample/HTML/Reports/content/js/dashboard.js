/*
   Licensed to the Apache Software Foundation (ASF) under one or more
   contributor license agreements.  See the NOTICE file distributed with
   this work for additional information regarding copyright ownership.
   The ASF licenses this file to You under the Apache License, Version 2.0
   (the "License"); you may not use this file except in compliance with
   the License.  You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/
var showControllersOnly = false;
var seriesFilter = "";
var filtersOnlySampleSeries = true;

/*
 * Add header in statistics table to group metrics by category
 * format
 *
 */
function summaryTableHeader(header) {
    var newRow = header.insertRow(-1);
    newRow.className = "tablesorter-no-sort";
    var cell = document.createElement('th');
    cell.setAttribute("data-sorter", false);
    cell.colSpan = 1;
    cell.innerHTML = "Requests";
    newRow.appendChild(cell);

    cell = document.createElement('th');
    cell.setAttribute("data-sorter", false);
    cell.colSpan = 3;
    cell.innerHTML = "Executions";
    newRow.appendChild(cell);

    cell = document.createElement('th');
    cell.setAttribute("data-sorter", false);
    cell.colSpan = 7;
    cell.innerHTML = "Response Times (ms)";
    newRow.appendChild(cell);

    cell = document.createElement('th');
    cell.setAttribute("data-sorter", false);
    cell.colSpan = 1;
    cell.innerHTML = "Throughput";
    newRow.appendChild(cell);

    cell = document.createElement('th');
    cell.setAttribute("data-sorter", false);
    cell.colSpan = 2;
    cell.innerHTML = "Network (KB/sec)";
    newRow.appendChild(cell);
}

/*
 * Populates the table identified by id parameter with the specified data and
 * format
 *
 */
function createTable(table, info, formatter, defaultSorts, seriesIndex, headerCreator) {
    var tableRef = table[0];

    // Create header and populate it with data.titles array
    var header = tableRef.createTHead();

    // Call callback is available
    if(headerCreator) {
        headerCreator(header);
    }

    var newRow = header.insertRow(-1);
    for (var index = 0; index < info.titles.length; index++) {
        var cell = document.createElement('th');
        cell.innerHTML = info.titles[index];
        newRow.appendChild(cell);
    }

    var tBody;

    // Create overall body if defined
    if(info.overall){
        tBody = document.createElement('tbody');
        tBody.className = "tablesorter-no-sort";
        tableRef.appendChild(tBody);
        var newRow = tBody.insertRow(-1);
        var data = info.overall.data;
        for(var index=0;index < data.length; index++){
            var cell = newRow.insertCell(-1);
            cell.innerHTML = formatter ? formatter(index, data[index]): data[index];
        }
    }

    // Create regular body
    tBody = document.createElement('tbody');
    tableRef.appendChild(tBody);

    var regexp;
    if(seriesFilter) {
        regexp = new RegExp(seriesFilter, 'i');
    }
    // Populate body with data.items array
    for(var index=0; index < info.items.length; index++){
        var item = info.items[index];
        if((!regexp || filtersOnlySampleSeries && !info.supportsControllersDiscrimination || regexp.test(item.data[seriesIndex]))
                &&
                (!showControllersOnly || !info.supportsControllersDiscrimination || item.isController)){
            if(item.data.length > 0) {
                var newRow = tBody.insertRow(-1);
                for(var col=0; col < item.data.length; col++){
                    var cell = newRow.insertCell(-1);
                    cell.innerHTML = formatter ? formatter(col, item.data[col]) : item.data[col];
                }
            }
        }
    }

    // Add support of columns sort
    table.tablesorter({sortList : defaultSorts});
}

$(document).ready(function() {

    // Customize table sorter default options
    $.extend( $.tablesorter.defaults, {
        theme: 'blue',
        cssInfoBlock: "tablesorter-no-sort",
        widthFixed: true,
        widgets: ['zebra']
    });

    var data = {"OkPercent": 81.19047619047619, "KoPercent": 18.80952380952381};
    var dataset = [
        {
            "label" : "FAIL",
            "data" : data.KoPercent,
            "color" : "#FF6347"
        },
        {
            "label" : "PASS",
            "data" : data.OkPercent,
            "color" : "#9ACD32"
        }];
    $.plot($("#flot-requests-summary"), dataset, {
        series : {
            pie : {
                show : true,
                radius : 1,
                label : {
                    show : true,
                    radius : 3 / 4,
                    formatter : function(label, series) {
                        return '<div style="font-size:8pt;text-align:center;padding:2px;color:white;">'
                            + label
                            + '<br/>'
                            + Math.round10(series.percent, -2)
                            + '%</div>';
                    },
                    background : {
                        opacity : 0.5,
                        color : '#000'
                    }
                }
            }
        },
        legend : {
            show : true
        }
    });

    // Creates APDEX table
    createTable($("#apdexTable"), {"supportsControllersDiscrimination": true, "overall": {"data": [0.02619047619047619, 500, 1500, "Total"], "isController": false}, "titles": ["Apdex", "T (Toleration threshold)", "F (Frustration threshold)", "Label"], "items": [{"data": [0.0, 500, 1500, ""], "isController": false}, {"data": [0.075, 500, 1500, "Selenium Documentation HTTP Request"], "isController": false}, {"data": [0.0, 500, 1500, "Convertors  - HTTP Request"], "isController": false}, {"data": [0.0, 500, 1500, "Release  - HTTP Request"], "isController": false}, {"data": [0.075, 500, 1500, "Downlaods  - HTTP Request-0"], "isController": false}, {"data": [0.0, 500, 1500, "Downlaods  - HTTP Request-1"], "isController": false}, {"data": [0.0, 500, 1500, "Downlaods  - HTTP Request"], "isController": false}, {"data": [0.05, 500, 1500, "Blog HTTP Request"], "isController": false}, {"data": [0.0, 500, 1500, "Dependencies HTTP Request"], "isController": false}, {"data": [0.0, 500, 1500, "Cart HTTP Request"], "isController": false}, {"data": [0.0, 500, 1500, "Practice HTTP Request"], "isController": false}, {"data": [0.0, 500, 1500, "Product HTTP Request"], "isController": false}, {"data": [0.0, 500, 1500, "Cource HTTP Request"], "isController": false}, {"data": [0.0, 500, 1500, "Curriences HTTP Request"], "isController": false}, {"data": [0.05, 500, 1500, "Calculators HTTP Request"], "isController": false}, {"data": [0.0, 500, 1500, "Documentation HTTP Request"], "isController": false}, {"data": [0.0, 500, 1500, "Formulas HTTP Request"], "isController": false}, {"data": [0.0, 500, 1500, "Home  - HTTP Request"], "isController": false}, {"data": [0.25, 500, 1500, "Projects HTTP  Request"], "isController": false}]}, function(index, item){
        switch(index){
            case 0:
                item = item.toFixed(3);
                break;
            case 1:
            case 2:
                item = formatDuration(item);
                break;
        }
        return item;
    }, [[0, 0]], 3);

    // Create statistics table
    createTable($("#statisticsTable"), {"supportsControllersDiscrimination": true, "overall": {"data": ["Total", 420, 79, 18.80952380952381, 21654.121428571423, 0, 183249, 9631.5, 53162.8, 84189.84999999998, 181904.66, 1.611622097641276, 131.6197355177048, 0.18059175909511255], "isController": false}, "titles": ["Label", "#Samples", "FAIL", "Error %", "Average", "Min", "Max", "Median", "90th pct", "95th pct", "99th pct", "Transactions/s", "Received", "Sent"], "items": [{"data": ["", 40, 40, 100.0, 0.0, 0, 0, 0.0, 0.0, 0.0, 0.0, 0.1763240836657777, 0.1503231689845937, 0.0], "isController": false}, {"data": ["Selenium Documentation HTTP Request", 20, 0, 0.0, 15744.349999999999, 909, 55870, 5286.5, 43368.4, 55256.09999999999, 55870.0, 0.08237944797531911, 7.99198100432904, 0.01061922571556848], "isController": false}, {"data": ["Convertors  - HTTP Request", 20, 0, 0.0, 29966.05, 1748, 169939, 6113.5, 154071.60000000015, 169544.75, 169939.0, 0.08578426116160467, 1.9289730444405364, 0.012566053881094436], "isController": false}, {"data": ["Release  - HTTP Request", 20, 2, 10.0, 36511.2, 4249, 63575, 39666.5, 62628.000000000015, 63553.9, 63575.0, 0.1145961060243173, 14.420174143107616, 0.01420141196727135], "isController": false}, {"data": ["Downlaods  - HTTP Request-0", 20, 0, 0.0, 20264.1, 400, 140200, 6412.0, 118938.80000000019, 139579.44999999998, 140200.0, 0.07885471413194758, 0.05097449025355733, 0.00954881303941553], "isController": false}, {"data": ["Downlaods  - HTTP Request-1", 20, 0, 0.0, 58792.99999999999, 1693, 181937, 27096.0, 178501.0, 181778.1, 181937.0, 0.07802929219629048, 20.351445303660743, 0.00975366152453631], "isController": false}, {"data": ["Downlaods  - HTTP Request", 20, 0, 0.0, 79057.84999999999, 4526, 183249, 39986.0, 183008.4, 183237.85, 183249.0, 0.07754462693279983, 20.275163473766654, 0.01908324803424371], "isController": false}, {"data": ["Blog HTTP Request", 40, 3, 7.5, 16567.02499999999, 572, 165489, 9348.5, 35488.399999999994, 37883.049999999996, 165489.0, 0.15914633903740336, 26.907076690631452, 0.018343014321181184], "isController": false}, {"data": ["Dependencies HTTP Request", 20, 0, 0.0, 18688.7, 3064, 56573, 13173.5, 49388.40000000002, 56267.399999999994, 56573.0, 0.08940625307333995, 4.341559791269926, 0.011525024810235228], "isController": false}, {"data": ["Cart HTTP Request", 20, 14, 70.0, 12726.900000000001, 2104, 26121, 12670.0, 21048.8, 25867.399999999994, 26121.0, 0.314001318805539, 1.3862360956291016, 0.011775049455207711], "isController": false}, {"data": ["Practice HTTP Request", 20, 3, 15.0, 18714.65, 2558, 80643, 13908.5, 51865.20000000004, 79301.34999999998, 80643.0, 0.13919434314189472, 14.346695700286741, 0.015829278573118787], "isController": false}, {"data": ["Product HTTP Request", 20, 12, 60.0, 15141.900000000003, 2363, 34808, 14639.5, 29282.200000000004, 34537.85, 34808.0, 0.23543815039789046, 2.2984304552490937, 0.012415683712388756], "isController": false}, {"data": ["Cource HTTP Request", 20, 1, 5.0, 27106.849999999995, 1948, 81555, 16873.0, 71639.90000000001, 81077.84999999999, 81555.0, 0.10225471649879851, 16.34568604926121, 0.012901669308246842], "isController": false}, {"data": ["Curriences HTTP Request", 20, 0, 0.0, 12698.35, 1579, 45025, 5943.5, 33558.200000000004, 44458.24999999999, 45025.0, 0.08347768015526848, 1.657406948473402, 0.012472739320074295], "isController": false}, {"data": ["Calculators HTTP Request", 20, 0, 0.0, 21772.95, 1066, 105898, 6702.5, 79572.0000000001, 104817.74999999999, 105898.0, 0.08537668192063384, 3.9561753487637454, 0.011172339235707943], "isController": false}, {"data": ["Documentation HTTP Request", 20, 0, 0.0, 23918.899999999994, 2191, 78776, 14215.0, 62110.30000000002, 77992.34999999999, 78776.0, 0.09043226623259179, 4.391325496812263, 0.011657284319045036], "isController": false}, {"data": ["Formulas HTTP Request", 20, 1, 5.0, 8606.45, 1630, 24391, 4024.0, 22733.80000000001, 24328.1, 24391.0, 0.08319121500769519, 1.8422873294580093, 0.011036647030073624], "isController": false}, {"data": ["Home  - HTTP Request", 20, 3, 15.0, 12509.9, 1604, 41953, 10161.0, 25426.800000000014, 41155.94999999999, 41953.0, 0.1775662766127457, 21.444934131234795, 0.01886641689010423], "isController": false}, {"data": ["Projects HTTP  Request", 20, 0, 0.0, 9380.4, 216, 85599, 3122.0, 22452.300000000007, 82458.74999999996, 85599.0, 0.08408979107891405, 1.985512708595238, 0.010429104948263756], "isController": false}]}, function(index, item){
        switch(index){
            // Errors pct
            case 3:
                item = item.toFixed(2) + '%';
                break;
            // Mean
            case 4:
            // Mean
            case 7:
            // Median
            case 8:
            // Percentile 1
            case 9:
            // Percentile 2
            case 10:
            // Percentile 3
            case 11:
            // Throughput
            case 12:
            // Kbytes/s
            case 13:
            // Sent Kbytes/s
                item = item.toFixed(2);
                break;
        }
        return item;
    }, [[0, 0]], 0, summaryTableHeader);

    // Create error table
    createTable($("#errorsTable"), {"supportsControllersDiscrimination": false, "titles": ["Type of error", "Number of errors", "% in errors", "% in all samples"], "items": [{"data": ["Non HTTP response code: org.apache.http.NoHttpResponseException/Non HTTP response message: practicetestautomation.com:443 failed to respond", 7, 8.860759493670885, 1.6666666666666667], "isController": false}, {"data": ["Non HTTP response code: java.net.SocketException/Non HTTP response message: Connection reset", 3, 3.7974683544303796, 0.7142857142857143], "isController": false}, {"data": ["Non HTTP response code: org.apache.http.conn.HttpHostConnectException/Non HTTP response message: Connect to www.demoblaze.com:443 [www.demoblaze.com/142.250.129.121] failed: Connection timed out: connect", 3, 3.7974683544303796, 0.7142857142857143], "isController": false}, {"data": ["Non HTTP response code: org.apache.http.NoHttpResponseException/Non HTTP response message: www.demoblaze.com:443 failed to respond", 8, 10.126582278481013, 1.9047619047619047], "isController": false}, {"data": ["Non HTTP response code: java.net.MalformedURLException/Non HTTP response message: Unrecognized IPv6 address format", 20, 25.31645569620253, 4.761904761904762], "isController": false}, {"data": ["Non HTTP response code: java.net.MalformedURLException/Non HTTP response message: Illegal character found in host: '/'", 20, 25.31645569620253, 4.761904761904762], "isController": false}, {"data": ["Non HTTP response code: javax.net.ssl.SSLHandshakeException/Non HTTP response message: Remote host terminated the handshake", 18, 22.78481012658228, 4.285714285714286], "isController": false}]}, function(index, item){
        switch(index){
            case 2:
            case 3:
                item = item.toFixed(2) + '%';
                break;
        }
        return item;
    }, [[1, 1]]);

        // Create top5 errors by sampler
    createTable($("#top5ErrorsBySamplerTable"), {"supportsControllersDiscrimination": false, "overall": {"data": ["Total", 420, 79, "Non HTTP response code: java.net.MalformedURLException/Non HTTP response message: Unrecognized IPv6 address format", 20, "Non HTTP response code: java.net.MalformedURLException/Non HTTP response message: Illegal character found in host: '/'", 20, "Non HTTP response code: javax.net.ssl.SSLHandshakeException/Non HTTP response message: Remote host terminated the handshake", 18, "Non HTTP response code: org.apache.http.NoHttpResponseException/Non HTTP response message: www.demoblaze.com:443 failed to respond", 8, "Non HTTP response code: org.apache.http.NoHttpResponseException/Non HTTP response message: practicetestautomation.com:443 failed to respond", 7], "isController": false}, "titles": ["Sample", "#Samples", "#Errors", "Error", "#Errors", "Error", "#Errors", "Error", "#Errors", "Error", "#Errors", "Error", "#Errors"], "items": [{"data": ["", 40, 40, "Non HTTP response code: java.net.MalformedURLException/Non HTTP response message: Unrecognized IPv6 address format", 20, "Non HTTP response code: java.net.MalformedURLException/Non HTTP response message: Illegal character found in host: '/'", 20, "", "", "", "", "", ""], "isController": false}, {"data": [], "isController": false}, {"data": [], "isController": false}, {"data": ["Release  - HTTP Request", 20, 2, "Non HTTP response code: javax.net.ssl.SSLHandshakeException/Non HTTP response message: Remote host terminated the handshake", 2, "", "", "", "", "", "", "", ""], "isController": false}, {"data": [], "isController": false}, {"data": [], "isController": false}, {"data": [], "isController": false}, {"data": ["Blog HTTP Request", 40, 3, "Non HTTP response code: javax.net.ssl.SSLHandshakeException/Non HTTP response message: Remote host terminated the handshake", 2, "Non HTTP response code: org.apache.http.NoHttpResponseException/Non HTTP response message: practicetestautomation.com:443 failed to respond", 1, "", "", "", "", "", ""], "isController": false}, {"data": [], "isController": false}, {"data": ["Cart HTTP Request", 20, 14, "Non HTTP response code: javax.net.ssl.SSLHandshakeException/Non HTTP response message: Remote host terminated the handshake", 7, "Non HTTP response code: org.apache.http.NoHttpResponseException/Non HTTP response message: www.demoblaze.com:443 failed to respond", 5, "Non HTTP response code: org.apache.http.conn.HttpHostConnectException/Non HTTP response message: Connect to www.demoblaze.com:443 [www.demoblaze.com/142.250.129.121] failed: Connection timed out: connect", 2, "", "", "", ""], "isController": false}, {"data": ["Practice HTTP Request", 20, 3, "Non HTTP response code: org.apache.http.NoHttpResponseException/Non HTTP response message: practicetestautomation.com:443 failed to respond", 2, "Non HTTP response code: java.net.SocketException/Non HTTP response message: Connection reset", 1, "", "", "", "", "", ""], "isController": false}, {"data": ["Product HTTP Request", 20, 12, "Non HTTP response code: javax.net.ssl.SSLHandshakeException/Non HTTP response message: Remote host terminated the handshake", 7, "Non HTTP response code: org.apache.http.NoHttpResponseException/Non HTTP response message: www.demoblaze.com:443 failed to respond", 3, "Non HTTP response code: java.net.SocketException/Non HTTP response message: Connection reset", 1, "Non HTTP response code: org.apache.http.conn.HttpHostConnectException/Non HTTP response message: Connect to www.demoblaze.com:443 [www.demoblaze.com/142.250.129.121] failed: Connection timed out: connect", 1, "", ""], "isController": false}, {"data": ["Cource HTTP Request", 20, 1, "Non HTTP response code: org.apache.http.NoHttpResponseException/Non HTTP response message: practicetestautomation.com:443 failed to respond", 1, "", "", "", "", "", "", "", ""], "isController": false}, {"data": [], "isController": false}, {"data": [], "isController": false}, {"data": [], "isController": false}, {"data": ["Formulas HTTP Request", 20, 1, "Non HTTP response code: java.net.SocketException/Non HTTP response message: Connection reset", 1, "", "", "", "", "", "", "", ""], "isController": false}, {"data": ["Home  - HTTP Request", 20, 3, "Non HTTP response code: org.apache.http.NoHttpResponseException/Non HTTP response message: practicetestautomation.com:443 failed to respond", 3, "", "", "", "", "", "", "", ""], "isController": false}, {"data": [], "isController": false}]}, function(index, item){
        return item;
    }, [[0, 0]], 0);

});
