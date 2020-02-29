<div class="container">
    <form>
        <div class="form-row">
            <div class="form-group col-md-6">
                <label for="bookFormat">Book format</label>
                <select id="bookFormat" class="form-control">
                    <option selected>A4</option>
                    <option>A5</option>
                    <option>B4</option>
                    <option>B5</option>
                </select>
            </div>
            <div class="form-group col-md-6">
                <label for="paperType">Paper type</label>
                <select id="paperType" class="form-control">
                    <option selected>ECO 90g</option>
                    <option>Munken yellow 80g</option>
                    <option>Coated white 90g</option>
                </select>
            </div>
        </div>
        <div class="form-row">
            <div class="form-group col-md-4">
                <label for="numberOfCopies">Number of copies</label>
                <input type="number" class="form-control" id="numberOfCopies" min="10">
            </div>
            <div class="form-group col-md-4">
                <label for="blackAndWhitePages">Black and white pages</label>
                <input type="number" class="form-control" id="blackAndWhitePages" min="1">
            </div>
            <div class="form-group col-md-4">
                <label for="colorPages">Color pages</label>
                <input type="number" class="form-control" id="colorPages" min="1">
            </div>
        </div>
        <div class="form-row">
            <div class="form-group col-md-6">
                <label for="Invoice">Invoice</label>
                <select id="Invoice" class="form-control">
                    <option selected>Yes</option>
                    <option>No</option>
                </select>
            </div>
            <div class="form-group col-md-6">
                <label for="PaymentCurrency">Payment currecny</label>
                <select id="PaymentCurrency" class="form-control">
                    <option selected>PLN</option>
                    <option>EUR</option>
                    <option>GBP</option>
                    <option>USD</option>
                    <option>CHF</option>
                </select>
            </div>
        </div>
        <br/>
        <button type="submit" class="btn btn-primary">Submit</button>
    </form>
</div>