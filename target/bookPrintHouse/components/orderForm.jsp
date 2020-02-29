<div class="container">
    <form method="post" action="place_order">
        <div class="form-row">
            <div class="form-group col-md-6">
                <label for="bookFormat">Book format</label>
                <select id="bookFormat" class="form-control" name="bookFormat" required>
                    <option selected>A4</option>
                    <option>A5</option>
                    <option>B4</option>
                    <option>B5</option>
                </select>
            </div>
            <div class="form-group col-md-6">
                <label for="paperType">Paper type</label>
                <select id="paperType" class="form-control" name="paperType" required>
                    <option selected>ECO 90g</option>
                    <option>Munken yellow 80g</option>
                    <option>Coated white 90g</option>
                </select>
            </div>
        </div>
        <div class="form-row">
            <div class="form-group col-md-4">
                <label for="numberOfCopies">Number of copies</label>
                <input type="number" class="form-control" id="numberOfCopies" min="10" name="numberOfCopies" required>
            </div>
            <div class="form-group col-md-4">
                <label for="blackAndWhitePages">Black and white pages</label>
                <input type="number" class="form-control" id="blackAndWhitePages" min="0" name="blackAndWhitePages" required>
            </div>
            <div class="form-group col-md-4">
                <label for="colorPages">Color pages</label>
                <input type="number" class="form-control" id="colorPages" min="0" name="colorPages" required>
            </div>
        </div>
        <div class="form-row">
            <div class="form-group col-md-6">
                <label for="Invoice">Invoice</label>
                <select id="Invoice" class="form-control" name="Invoice" required>
                    <option selected>Yes</option>
                    <option>No</option>
                </select>
            </div>
            <div class="form-group col-md-6">
                <label for="PaymentCurrency">Payment currecny</label>
                <select id="PaymentCurrency" class="form-control" name="PaymentCurrency" required>
                    <option selected>PLN</option>
                    <option>EUR</option>
                    <option>GBP</option>
                    <option>USD</option>
                    <option>CHF</option>
                </select>
            </div>
        </div>
        <br/>
        <input type="submit" value="Submit" class="btn btn-primary">
    </form>
</div>